/*
 * Copyright (C) 2013-2017 XHawk87
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package me.xhawk87.LanguageAPI;

import java.util.EnumMap;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 * Language
 *
 * @author XHawk87
 */
public class PluginLanguageLibrary {

    private ISOCode locale;
    private Plugin plugin;
    private EnumMap<ISOCode, PluginLanguageData> languages = new EnumMap<>(ISOCode.class);

    public PluginLanguageLibrary(Plugin plugin, ISOCode pluginLocale) {
        this.plugin = plugin;
        this.locale = pluginLocale;
        languages.put(locale, new PluginLanguageData(plugin, locale));
    }

    /**
     * <p> Get a formatted string constructed using the locale-specific template
     * for the given key, with the given parameters inserted. </p>
     *
     * <p> The default language.yml file is constructed using the given
     * templates and provide a basis for translators to alter the file for other
     * locales. </p>
     *
     * <p> The default locale template should contain text, and where parameters
     * need to be inserted, there should be a number surrounded by curly braces
     * E.g. {0} has earned ${1} credits for {2} </p>
     *
     * <p> Each parameter is inserted into the brace with the same index, so the
     * first parameter replaces {0}, the second replaces {1} and the third
     * replaces {2} and so on. </p>
     *
     * <p> There is no limit to the number of parameters that can be inserted,
     * but there must be a corresponding parameter for every brace. </p>
     *
     * @param forWhom The player for whom it should be translated
     * @param key The key for this string template
     * @param template The default locale template
     * @param params The parameters to insert into the template
     * @return The formatted string
     */
    public String get(CommandSender forWhom, String key, String template, Object... params) {
        return get(LanguageAPI.getLocale(forWhom), key, template, params);
    }

    /**
     * <p> Get a formatted string constructed using the locale-specific template
     * for the given key, with the given parameters inserted. </p>
     *
     * <p> The default language.yml file is constructed using the given
     * templates and provide a basis for translators to alter the file for other
     * locales. </p>
     *
     * <p> The default locale template should contain text, and where parameters
     * need to be inserted, there should be a number surrounded by curly braces
     * E.g. {0} has earned ${1} credits for {2} </p>
     *
     * <p> Each parameter is inserted into the brace with the same index, so the
     * first parameter replaces {0}, the second replaces {1} and the third
     * replaces {2} and so on. </p>
     *
     * <p> There is no limit to the number of parameters that can be inserted,
     * but there must be a corresponding parameter for every brace. </p>
     *
     * @param preferredLocale The locale to attempt to translate for
     * @param key The key for this string template
     * @param template The default locale template
     * @param params The parameters to insert into the template
     * @return The formatted string
     */
    public String get(ISOCode preferredLocale, String key, String template, Object... params) {
        PluginLanguageData preferred = getLanguage(preferredLocale);
        if (preferred != null && preferred.containsKey(key)) {
            return compile(preferred.get(key), params);
        }
        PluginLanguageData server = getLanguage(LanguageAPI.getDefaultLocale());
        if (server != null && server.containsKey(key)) {
            return compile(server.get(key), params);
        }
        PluginLanguageData pluginLang = getLanguage(locale);
        if (pluginLang.containsKey(key)) {
            return compile(pluginLang.get(key), params);
        }
        pluginLang.put(key, template);
        return compile(template, params);
    }

    private PluginLanguageData getLanguage(ISOCode locale) {
        if (locale == null) {
            return null;
        }
        if (!languages.containsKey(locale)) {
            languages.put(locale, new PluginLanguageData(plugin, locale));
        }
        return languages.get(locale);
    }

    private static String compile(String template, Object[] params) throws IllegalArgumentException {
        if (params.length == 0) {
            return template; // For the sake of efficiency, don't parse templates with no dynamic data
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < template.length(); i++) {
            char c = template.charAt(i);
            if (c == '{') {
                try {
                    int endIndex = template.indexOf('}', i);
                    if (endIndex != -1) {
                        int param = Integer.parseInt(template.substring(i + 1, endIndex));
                        if (param >= params.length) {
                            throw new IllegalArgumentException();
                        }
                        sb.append(params[param].toString());
                        i = endIndex;
                        continue;
                    }
                } catch (NumberFormatException ex) {
                    // then read it as it is
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
