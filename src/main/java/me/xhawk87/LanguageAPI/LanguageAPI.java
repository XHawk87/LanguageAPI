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

import java.util.HashMap;
import me.xhawk87.LanguageAPI.commands.LocaleCommand;
import me.xhawk87.LanguageAPI.commands.ServerLocaleCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author XHawk87
 */
public class LanguageAPI extends JavaPlugin {

    private static ISOCode serverLocale;
    private static HashMap<String, ISOCode> locales = new HashMap<>();
    private static LanguageAPI instance;
    private static PluginLanguageLibrary language;

    @Override
    public void onEnable() {
        instance = this;
        language = new PluginLanguageLibrary(this, ISOCode.eng);
        getCommand("Locale").setExecutor(new LocaleCommand(language));
        getCommand("ServerLocale").setExecutor(new ServerLocaleCommand(language));
        FileConfiguration config = getConfig();
        if (config.contains("server-locale")) {
            serverLocale = ISOCode.findMatch(config.getString("server-locale"));
        }
        if (config.contains("players")) {
            ConfigurationSection players = config.getConfigurationSection("players");
            for (String playerName : players.getKeys(false)) {
                locales.put(playerName, ISOCode.findMatch(players.getString(playerName)));
            }
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("The " + command.getName() + " command has not yet been implemented");
        return true;
    }

    public static ISOCode getLocale(CommandSender forWhom) {
        if (forWhom instanceof Player) {
            Player player = (Player) forWhom;
            if (locales.containsKey(player.getName())) {
                return locales.get(player.getName());
            }
        }
        return getDefaultLocale();
    }

    public static void setLocale(Player player, ISOCode locale) {
        locales.put(player.getName(), locale);
        instance.getConfig().set("players." + player.getName(), locale.name());
        instance.saveConfig();
    }

    public static ISOCode getDefaultLocale() {
        return serverLocale;
    }

    public static void setDefaultLocale(ISOCode locale) {
        serverLocale = locale;
        instance.getConfig().set("server-locale", locale.name());
        instance.saveConfig();
    }
}
