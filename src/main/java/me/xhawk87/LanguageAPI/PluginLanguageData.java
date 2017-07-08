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

import java.io.*;
import java.util.HashMap;
import org.bukkit.plugin.Plugin;

/**
 * Language
 *
 * @author XHawk87
 */
public class PluginLanguageData {

    private Plugin plugin;
    private ISOCode locale;
    private File file;
    private HashMap<String, String> templates = new HashMap<>();

    public PluginLanguageData(Plugin plugin, ISOCode locale) {
        this.plugin = plugin;
        this.locale = locale;
        File languagesFolder = new File(plugin.getDataFolder(), "languages");
        if (!languagesFolder.exists()) {
            languagesFolder.mkdirs();
        }
        this.file = new File(languagesFolder, locale.getFileName());
        try {
            load();
        } catch (IOException ex) {
            plugin.getLogger().severe("Unable to load " + file.getName() + ": " + ex.getLocalizedMessage());
            ex.printStackTrace(System.err);
        }
    }

    private void load() throws IOException {
        if (file.exists()) {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            int count = 0;
            while ((line = in.readLine()) != null) {
                count++;
                int sep = line.indexOf(":");
                if (sep != -1) {
                    String key = line.substring(0, sep).trim();
                    String template = line.substring(sep + 1).trim();
                    templates.put(key, template);
                } else {
                    plugin.getLogger().warning("Error on line " + count + " of language.yml: missing colon (" + line + ")");
                }
            }
            in.close();
        }
    }

    private void save() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        for (String key : templates.keySet()) {
            String template = templates.get(key);
            out.write(key + ": " + template + "\n");
        }
        out.close();
    }

    public boolean containsKey(String key) {
        return templates.containsKey(key);
    }

    public String get(String key) {
        return templates.get(key);
    }

    public void put(String key, String template) {
        templates.put(key, template);
        try {
            save();
        } catch (IOException ex) {
            plugin.getLogger().severe("Unable to save " + file.getName() + ": " + ex.getLocalizedMessage());
            ex.printStackTrace(System.err);
        }
    }
}
