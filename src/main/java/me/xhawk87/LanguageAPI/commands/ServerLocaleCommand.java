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
package me.xhawk87.LanguageAPI.commands;

import java.util.Arrays;
import java.util.Iterator;
import me.xhawk87.LanguageAPI.ISOCode;
import me.xhawk87.LanguageAPI.LanguageAPI;
import me.xhawk87.LanguageAPI.PluginLanguageLibrary;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * ServerLocaleCommand
 *
 * @author XHawk87
 */
public class ServerLocaleCommand implements CommandExecutor {

    private PluginLanguageLibrary language;

    public ServerLocaleCommand(PluginLanguageLibrary language) {
        this.language = language;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("languageapi.commands.serverlocale")) {
            sender.sendMessage(language.get(sender, "no-perms", "You do not have permission to use this command"));
            return true;
        }
        if (args.length == 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = Arrays.asList(args).iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        String languageName = sb.toString();
        ISOCode locale = ISOCode.findMatch(languageName);
        if (locale == null) {
            sender.sendMessage(language.get(sender, "unknown-language-code", "Unknown language: {0}", languageName));
            return true;
        }
        LanguageAPI.setDefaultLocale(locale);
        sender.sendMessage(language.get(sender, "server-locale-set", "Server default locale was set to {0}", locale.name()));
        return true;
    }
}
