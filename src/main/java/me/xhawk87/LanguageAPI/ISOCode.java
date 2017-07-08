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

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 * LanguageCode
 *
 * @author XHawk87
 */
public enum ISOCode {

    /**
     * Afar
     */
    aar("Afar"),
    /**
     * Abkhazian
     */
    abk("Abkhazian"),
    /**
     * Achinese
     */
    ace("Achinese"),
    /**
     * Acoli
     */
    ach("Acoli"),
    /**
     * Adangme
     */
    ada("Adangme"),
    /**
     * Adyghe, Adygei
     */
    ady("Adyghe", "Adygei"),
    /**
     * Afro-Asiatic languages
     */
    afa("Afro-Asiatic languages"),
    /**
     * Afrihili
     */
    afh("Afrihili"),
    /**
     * Afrikaans
     */
    afr("Afrikaans"),
    /**
     * Ainu
     */
    ain("Ainu"),
    /**
     * Akan
     */
    aka("Akan"),
    /**
     * Akkadian
     */
    akk("Akkadian"),
    /**
     * Albanian
     */
    alb("Albanian"),
    /**
     * Aleut
     */
    ale("Aleut"),
    /**
     * Algonquian languages
     */
    alg("Algonquian languages"),
    /**
     * Southern Altai
     */
    alt("Southern Altai"),
    /**
     * Amharic
     */
    amh("Amharic"),
    /**
     * English, Old (ca.450-1100)
     */
    ang("English, Old (ca.450-1100)"),
    /**
     * Angika
     */
    anp("Angika"),
    /**
     * Apache languages
     */
    apa("Apache languages"),
    /**
     * Arabic
     */
    ara("Arabic"),
    /**
     * Official Aramaic (700-300 BCE), Imperial Aramaic (700-300 BCE)
     */
    arc("Official Aramaic (700-300 BCE)", "Imperial Aramaic (700-300 BCE)"),
    /**
     * Aragonese
     */
    arg("Aragonese"),
    /**
     * Armenian
     */
    arm("Armenian"),
    /**
     * Mapudungun, Mapuche
     */
    arn("Mapudungun", "Mapuche"),
    /**
     * Arapaho
     */
    arp("Arapaho"),
    /**
     * Artificial languages
     */
    art("Artificial languages"),
    /**
     * Arawak
     */
    arw("Arawak"),
    /**
     * Assamese
     */
    asm("Assamese"),
    /**
     * Asturian, Bable, Leonese, Asturleonese
     */
    ast("Asturian", "Bable", "Leonese", "Asturleonese"),
    /**
     * Athapascan languages
     */
    ath("Athapascan languages"),
    /**
     * Australian languages
     */
    aus("Australian languages"),
    /**
     * Avaric
     */
    ava("Avaric"),
    /**
     * Avestan
     */
    ave("Avestan"),
    /**
     * Awadhi
     */
    awa("Awadhi"),
    /**
     * Aymara
     */
    aym("Aymara"),
    /**
     * Azerbaijani
     */
    aze("Azerbaijani"),
    /**
     * Banda languages
     */
    bad("Banda languages"),
    /**
     * Bamileke languages
     */
    bai("Bamileke languages"),
    /**
     * Bashkir
     */
    bak("Bashkir"),
    /**
     * Baluchi
     */
    bal("Baluchi"),
    /**
     * Bambara
     */
    bam("Bambara"),
    /**
     * Balinese
     */
    ban("Balinese"),
    /**
     * Basque
     */
    baq("Basque"),
    /**
     * Basa
     */
    bas("Basa"),
    /**
     * Baltic languages
     */
    bat("Baltic languages"),
    /**
     * Beja, Bedawiyet
     */
    bej("Beja", "Bedawiyet"),
    /**
     * Belarusian
     */
    bel("Belarusian"),
    /**
     * Bemba
     */
    bem("Bemba"),
    /**
     * Bengali
     */
    ben("Bengali"),
    /**
     * Berber languages
     */
    ber("Berber languages"),
    /**
     * Bhojpuri
     */
    bho("Bhojpuri"),
    /**
     * Bihari languages
     */
    bih("Bihari languages"),
    /**
     * Bikol
     */
    bik("Bikol"),
    /**
     * Bini, Edo
     */
    bin("Bini", "Edo"),
    /**
     * Bislama
     */
    bis("Bislama"),
    /**
     * Siksika
     */
    bla("Siksika"),
    /**
     * Bantu (Other)
     */
    bnt("Bantu (Other)"),
    /**
     * Bosnian
     */
    bos("Bosnian"),
    /**
     * Braj
     */
    bra("Braj"),
    /**
     * Breton
     */
    bre("Breton"),
    /**
     * Batak languages
     */
    btk("Batak languages"),
    /**
     * Buriat
     */
    bua("Buriat"),
    /**
     * Buginese
     */
    bug("Buginese"),
    /**
     * Bulgarian
     */
    bul("Bulgarian"),
    /**
     * Burmese
     */
    bur("Burmese"),
    /**
     * Blin, Bilin
     */
    byn("Blin", "Bilin"),
    /**
     * Caddo
     */
    cad("Caddo"),
    /**
     * Central American Indian languages
     */
    cai("Central American Indian languages"),
    /**
     * Galibi Carib
     */
    car("Galibi Carib"),
    /**
     * Catalan, Valencian
     */
    cat("Catalan", "Valencian"),
    /**
     * Caucasian languages
     */
    cau("Caucasian languages"),
    /**
     * Cebuano
     */
    ceb("Cebuano"),
    /**
     * Celtic languages
     */
    cel("Celtic languages"),
    /**
     * Chamorro
     */
    cha("Chamorro"),
    /**
     * Chibcha
     */
    chb("Chibcha"),
    /**
     * Chechen
     */
    che("Chechen"),
    /**
     * Chagatai
     */
    chg("Chagatai"),
    /**
     * Chinese
     */
    chi("Chinese"),
    /**
     * Chuukese
     */
    chk("Chuukese"),
    /**
     * Mari
     */
    chm("Mari"),
    /**
     * Chinook jargon
     */
    chn("Chinook jargon"),
    /**
     * Choctaw
     */
    cho("Choctaw"),
    /**
     * Chipewyan, Dene Suline
     */
    chp("Chipewyan", "Dene Suline"),
    /**
     * Cherokee
     */
    chr("Cherokee"),
    /**
     * Church Slavic, Old Slavonic, Church Slavonic, Old Bulgarian, Old Church
     * Slavonic
     */
    chu("Church Slavic", "Old Slavonic", "Church Slavonic", "Old Bulgarian", "Old Church Slavonic"),
    /**
     * Chuvash
     */
    chv("Chuvash"),
    /**
     * Cheyenne
     */
    chy("Cheyenne"),
    /**
     * Chamic languages
     */
    cmc("Chamic languages"),
    /**
     * Coptic
     */
    cop("Coptic"),
    /**
     * Cornish
     */
    cor("Cornish"),
    /**
     * Corsican
     */
    cos("Corsican"),
    /**
     * Creoles and pidgins, English based
     */
    cpe("Creoles and pidgins, English based"),
    /**
     * Creoles and pidgins, French-based
     */
    cpf("Creoles and pidgins, French-based "),
    /**
     * Creoles and pidgins, Portuguese-based
     */
    cpp("Creoles and pidgins, Portuguese-based "),
    /**
     * Cree
     */
    cre("Cree"),
    /**
     * Crimean Tatar, Crimean Turkish
     */
    crh("Crimean Tatar", "Crimean Turkish"),
    /**
     * Creoles and pidgins
     */
    crp("Creoles and pidgins "),
    /**
     * Kashubian
     */
    csb("Kashubian"),
    /**
     * Cushitic languages
     */
    cus("Cushitic languages"),
    /**
     * Czech
     */
    cze("Czech"),
    /**
     * Dakota
     */
    dak("Dakota"),
    /**
     * Danish
     */
    dan("Danish"),
    /**
     * Dargwa
     */
    dar("Dargwa"),
    /**
     * Land Dayak languages
     */
    day("Land Dayak languages"),
    /**
     * Delaware
     */
    del("Delaware"),
    /**
     * Slave (Athapascan)
     */
    den("Slave (Athapascan)"),
    /**
     * Dogrib
     */
    dgr("Dogrib"),
    /**
     * Dinka
     */
    din("Dinka"),
    /**
     * Divehi, Dhivehi, Maldivian
     */
    div("Divehi", "Dhivehi", "Maldivian"),
    /**
     * Dogri
     */
    doi("Dogri"),
    /**
     * Dravidian languages
     */
    dra("Dravidian languages"),
    /**
     * Lower Sorbian
     */
    dsb("Lower Sorbian"),
    /**
     * Duala
     */
    dua("Duala"),
    /**
     * Dutch, Middle (ca.1050-1350)
     */
    dum("Dutch, Middle (ca.1050-1350)"),
    /**
     * Dutch, Flemish
     */
    dut("Dutch", "Flemish"),
    /**
     * Dyula
     */
    dyu("Dyula"),
    /**
     * Dzongkha
     */
    dzo("Dzongkha"),
    /**
     * Efik
     */
    efi("Efik"),
    /**
     * Egyptian (Ancient)
     */
    egy("Egyptian (Ancient)"),
    /**
     * Ekajuk
     */
    eka("Ekajuk"),
    /**
     * Elamite
     */
    elx("Elamite"),
    /**
     * English
     */
    eng("English"),
    /**
     * English, Middle (1100-1500)
     */
    enm("English, Middle (1100-1500)"),
    /**
     * Esperanto
     */
    epo("Esperanto"),
    /**
     * Estonian
     */
    est("Estonian"),
    /**
     * Ewe
     */
    ewe("Ewe"),
    /**
     * Ewondo
     */
    ewo("Ewondo"),
    /**
     * Fang
     */
    fan("Fang"),
    /**
     * Faroese
     */
    fao("Faroese"),
    /**
     * Fanti
     */
    fat("Fanti"),
    /**
     * Fijian
     */
    fij("Fijian"),
    /**
     * Filipino, Pilipino
     */
    fil("Filipino", "Pilipino"),
    /**
     * Finnish
     */
    fin("Finnish"),
    /**
     * Finno-Ugrian languages
     */
    fiu("Finno-Ugrian languages"),
    /**
     * Fon
     */
    fon("Fon"),
    /**
     * French
     */
    fre("French"),
    /**
     * French, Middle (ca.1400-1600)
     */
    frm("French, Middle (ca.1400-1600)"),
    /**
     * French, Old (842-ca.1400)
     */
    fro("French, Old (842-ca.1400)"),
    /**
     * Northern Frisian
     */
    frr("Northern Frisian"),
    /**
     * Eastern Frisian
     */
    frs("Eastern Frisian"),
    /**
     * Western Frisian
     */
    fry("Western Frisian"),
    /**
     * Fulah
     */
    ful("Fulah"),
    /**
     * Friulian
     */
    fur("Friulian"),
    /**
     * Ga
     */
    gaa("Ga"),
    /**
     * Gayo
     */
    gay("Gayo"),
    /**
     * Gbaya
     */
    gba("Gbaya"),
    /**
     * Germanic languages
     */
    gem("Germanic languages"),
    /**
     * Georgian
     */
    geo("Georgian"),
    /**
     * German
     */
    ger("German"),
    /**
     * Geez
     */
    gez("Geez"),
    /**
     * Gilbertese
     */
    gil("Gilbertese"),
    /**
     * Gaelic, Scottish Gaelic
     */
    gla("Gaelic", "Scottish Gaelic"),
    /**
     * Irish
     */
    gle("Irish"),
    /**
     * Galician
     */
    glg("Galician"),
    /**
     * Manx
     */
    glv("Manx"),
    /**
     * German, Middle High (ca.1050-1500)
     */
    gmh("German, Middle High (ca.1050-1500)"),
    /**
     * German, Old High (ca.750-1050)
     */
    goh("German, Old High (ca.750-1050)"),
    /**
     * Gondi
     */
    gon("Gondi"),
    /**
     * Gorontalo
     */
    gor("Gorontalo"),
    /**
     * Gothic
     */
    got("Gothic"),
    /**
     * Grebo
     */
    grb("Grebo"),
    /**
     * Greek, Ancient (to 1453)
     */
    grc("Greek, Ancient (to 1453)"),
    /**
     * Greek, Modern (1453-)
     */
    gre("Greek, Modern (1453-)"),
    /**
     * Guarani
     */
    grn("Guarani"),
    /**
     * Swiss German, Alemannic, Alsatian
     */
    gsw("Swiss German", "Alemannic", "Alsatian"),
    /**
     * Gujarati
     */
    guj("Gujarati"),
    /**
     * Gwich'in
     */
    gwi("Gwich'in"),
    /**
     * Haida
     */
    hai("Haida"),
    /**
     * Haitian, Haitian Creole
     */
    hat("Haitian", "Haitian Creole"),
    /**
     * Hausa
     */
    hau("Hausa"),
    /**
     * Hawaiian
     */
    haw("Hawaiian"),
    /**
     * Hebrew
     */
    heb("Hebrew"),
    /**
     * Herero
     */
    her("Herero"),
    /**
     * Hiligaynon
     */
    hil("Hiligaynon"),
    /**
     * Himachali languages, Western Pahari languages
     */
    him("Himachali languages", "Western Pahari languages"),
    /**
     * Hindi
     */
    hin("Hindi"),
    /**
     * Hittite
     */
    hit("Hittite"),
    /**
     * Hmong, Mong
     */
    hmn("Hmong", "Mong"),
    /**
     * Hiri Motu
     */
    hmo("Hiri Motu"),
    /**
     * Croatian
     */
    hrv("Croatian"),
    /**
     * Upper Sorbian
     */
    hsb("Upper Sorbian"),
    /**
     * Hungarian
     */
    hun("Hungarian"),
    /**
     * Hupa
     */
    hup("Hupa"),
    /**
     * Iban
     */
    iba("Iban"),
    /**
     * Igbo
     */
    ibo("Igbo"),
    /**
     * Icelandic
     */
    ice("Icelandic"),
    /**
     * Ido
     */
    ido("Ido"),
    /**
     * Sichuan Yi, Nuosu
     */
    iii("Sichuan Yi", "Nuosu"),
    /**
     * Ijo languages
     */
    ijo("Ijo languages"),
    /**
     * Inuktitut
     */
    iku("Inuktitut"),
    /**
     * Interlingue, Occidental
     */
    ile("Interlingue", "Occidental"),
    /**
     * Iloko
     */
    ilo("Iloko"),
    /**
     * Interlingua (International Auxiliary Language Association)
     */
    ina("Interlingua (International Auxiliary Language Association)"),
    /**
     * Indic languages
     */
    inc("Indic languages"),
    /**
     * Indonesian
     */
    ind("Indonesian"),
    /**
     * Indo-European languages
     */
    ine("Indo-European languages"),
    /**
     * Ingush
     */
    inh("Ingush"),
    /**
     * Inupiaq
     */
    ipk("Inupiaq"),
    /**
     * Iranian languages
     */
    ira("Iranian languages"),
    /**
     * Iroquoian languages
     */
    iro("Iroquoian languages"),
    /**
     * Italian
     */
    ita("Italian"),
    /**
     * Javanese
     */
    jav("Javanese"),
    /**
     * Lojban
     */
    jbo("Lojban"),
    /**
     * Japanese
     */
    jpn("Japanese"),
    /**
     * Judeo-Persian
     */
    jpr("Judeo-Persian"),
    /**
     * Judeo-Arabic
     */
    jrb("Judeo-Arabic"),
    /**
     * Kara-Kalpak
     */
    kaa("Kara-Kalpak"),
    /**
     * Kabyle
     */
    kab("Kabyle"),
    /**
     * Kachin, Jingpho
     */
    kac("Kachin", "Jingpho"),
    /**
     * Kalaallisut, Greenlandic
     */
    kal("Kalaallisut", "Greenlandic"),
    /**
     * Kamba
     */
    kam("Kamba"),
    /**
     * Kannada
     */
    kan("Kannada"),
    /**
     * Karen languages
     */
    kar("Karen languages"),
    /**
     * Kashmiri
     */
    kas("Kashmiri"),
    /**
     * Kanuri
     */
    kau("Kanuri"),
    /**
     * Kawi
     */
    kaw("Kawi"),
    /**
     * Kazakh
     */
    kaz("Kazakh"),
    /**
     * Kabardian
     */
    kbd("Kabardian"),
    /**
     * Khasi
     */
    kha("Khasi"),
    /**
     * Khoisan languages
     */
    khi("Khoisan languages"),
    /**
     * Central Khmer
     */
    khm("Central Khmer"),
    /**
     * Khotanese, Sakan
     */
    kho("Khotanese", "Sakan"),
    /**
     * Kikuyu, Gikuyu
     */
    kik("Kikuyu", "Gikuyu"),
    /**
     * Kinyarwanda
     */
    kin("Kinyarwanda"),
    /**
     * Kirghiz, Kyrgyz
     */
    kir("Kirghiz", "Kyrgyz"),
    /**
     * Kimbundu
     */
    kmb("Kimbundu"),
    /**
     * Konkani
     */
    kok("Konkani"),
    /**
     * Komi
     */
    kom("Komi"),
    /**
     * Kongo
     */
    kon("Kongo"),
    /**
     * Korean
     */
    kor("Korean"),
    /**
     * Kosraean
     */
    kos("Kosraean"),
    /**
     * Kpelle
     */
    kpe("Kpelle"),
    /**
     * Karachay-Balkar
     */
    krc("Karachay-Balkar"),
    /**
     * Karelian
     */
    krl("Karelian"),
    /**
     * Kru languages
     */
    kro("Kru languages"),
    /**
     * Kurukh
     */
    kru("Kurukh"),
    /**
     * Kuanyama, Kwanyama
     */
    kua("Kuanyama", "Kwanyama"),
    /**
     * Kumyk
     */
    kum("Kumyk"),
    /**
     * Kurdish
     */
    kur("Kurdish"),
    /**
     * Kutenai
     */
    kut("Kutenai"),
    /**
     * Ladino
     */
    lad("Ladino"),
    /**
     * Lahnda
     */
    lah("Lahnda"),
    /**
     * Lamba
     */
    lam("Lamba"),
    /**
     * Lao
     */
    lao("Lao"),
    /**
     * Latin
     */
    lat("Latin"),
    /**
     * Latvian
     */
    lav("Latvian"),
    /**
     * Lezghian
     */
    lez("Lezghian"),
    /**
     * Limburgan, Limburger, Limburgish
     */
    lim("Limburgan", "Limburger", "Limburgish"),
    /**
     * Lingala
     */
    lin("Lingala"),
    /**
     * Lithuanian
     */
    lit("Lithuanian"),
    /**
     * Mongo
     */
    lol("Mongo"),
    /**
     * Lozi
     */
    loz("Lozi"),
    /**
     * Luxembourgish, Letzeburgesch
     */
    ltz("Luxembourgish", "Letzeburgesch"),
    /**
     * Luba-Lulua
     */
    lua("Luba-Lulua"),
    /**
     * Luba-Katanga
     */
    lub("Luba-Katanga"),
    /**
     * Ganda
     */
    lug("Ganda"),
    /**
     * Luiseno
     */
    lui("Luiseno"),
    /**
     * Lunda
     */
    lun("Lunda"),
    /**
     * Luo (Kenya and Tanzania)
     */
    luo("Luo (Kenya and Tanzania)"),
    /**
     * Lushai
     */
    lus("Lushai"),
    /**
     * Macedonian
     */
    mac("Macedonian"),
    /**
     * Madurese
     */
    mad("Madurese"),
    /**
     * Magahi
     */
    mag("Magahi"),
    /**
     * Marshallese
     */
    mah("Marshallese"),
    /**
     * Maithili
     */
    mai("Maithili"),
    /**
     * Makasar
     */
    mak("Makasar"),
    /**
     * Malayalam
     */
    mal("Malayalam"),
    /**
     * Mandingo
     */
    man("Mandingo"),
    /**
     * Maori
     */
    mao("Maori"),
    /**
     * Austronesian languages
     */
    map("Austronesian languages"),
    /**
     * Marathi
     */
    mar("Marathi"),
    /**
     * Masai
     */
    mas("Masai"),
    /**
     * Malay
     */
    may("Malay"),
    /**
     * Moksha
     */
    mdf("Moksha"),
    /**
     * Mandar
     */
    mdr("Mandar"),
    /**
     * Mende
     */
    men("Mende"),
    /**
     * Irish, Middle (900-1200)
     */
    mga("Irish, Middle (900-1200)"),
    /**
     * Mi'kmaq, Micmac
     */
    mic("Mi'kmaq", "Micmac"),
    /**
     * Minangkabau
     */
    min("Minangkabau"),
    /**
     * Uncoded languages
     */
    mis("Uncoded languages"),
    /**
     * Mon-Khmer languages
     */
    mkh("Mon-Khmer languages"),
    /**
     * Malagasy
     */
    mlg("Malagasy"),
    /**
     * Maltese
     */
    mlt("Maltese"),
    /**
     * Manchu
     */
    mnc("Manchu"),
    /**
     * Manipuri
     */
    mni("Manipuri"),
    /**
     * Manobo languages
     */
    mno("Manobo languages"),
    /**
     * Mohawk
     */
    moh("Mohawk"),
    /**
     * Mongolian
     */
    mon("Mongolian"),
    /**
     * Mossi
     */
    mos("Mossi"),
    /**
     * Multiple languages
     */
    mul("Multiple languages"),
    /**
     * Munda languages
     */
    mun("Munda languages"),
    /**
     * Creek
     */
    mus("Creek"),
    /**
     * Mirandese
     */
    mwl("Mirandese"),
    /**
     * Marwari
     */
    mwr("Marwari"),
    /**
     * Mayan languages
     */
    myn("Mayan languages"),
    /**
     * Erzya
     */
    myv("Erzya"),
    /**
     * Nahuatl languages
     */
    nah("Nahuatl languages"),
    /**
     * North American Indian languages
     */
    nai("North American Indian languages"),
    /**
     * Neapolitan
     */
    nap("Neapolitan"),
    /**
     * Nauru
     */
    nau("Nauru"),
    /**
     * Navajo, Navaho
     */
    nav("Navajo", "Navaho"),
    /**
     * Ndebele, South, South Ndebele
     */
    nbl("Ndebele, South", "South Ndebele"),
    /**
     * Ndebele, North, North Ndebele
     */
    nde("Ndebele, North", "North Ndebele"),
    /**
     * Ndonga
     */
    ndo("Ndonga"),
    /**
     * Low German, Low Saxon, German, Low, Saxon, Low
     */
    nds("Low German", "Low Saxon", "German, Low", "Saxon, Low"),
    /**
     * Nepali
     */
    nep("Nepali"),
    /**
     * Nepal Bhasa, Newari
     */
    _new("Nepal Bhasa", "Newari"),
    /**
     * Nias
     */
    nia("Nias"),
    /**
     * Niger-Kordofanian languages
     */
    nic("Niger-Kordofanian languages"),
    /**
     * Niuean
     */
    niu("Niuean"),
    /**
     * Norwegian Nynorsk, Nynorsk, Norwegian
     */
    nno("Norwegian Nynorsk", "Nynorsk, Norwegian"),
    /**
     * Bokmål, Norwegian, Norwegian Bokmål
     */
    nob("Bokmål, Norwegian", "Norwegian Bokmål"),
    /**
     * Nogai
     */
    nog("Nogai"),
    /**
     * Norse, Old
     */
    non("Norse, Old"),
    /**
     * Norwegian
     */
    nor("Norwegian"),
    /**
     * N'Ko
     */
    nqo("N'Ko"),
    /**
     * Pedi, Sepedi, Northern Sotho
     */
    nso("Pedi", "Sepedi", "Northern Sotho"),
    /**
     * Nubian languages
     */
    nub("Nubian languages"),
    /**
     * Classical Newari, Old Newari, Classical Nepal Bhasa
     */
    nwc("Classical Newari", "Old Newari", "Classical Nepal Bhasa"),
    /**
     * Chichewa, Chewa, Nyanja
     */
    nya("Chichewa", "Chewa", "Nyanja"),
    /**
     * Nyamwezi
     */
    nym("Nyamwezi"),
    /**
     * Nyankole
     */
    nyn("Nyankole"),
    /**
     * Nyoro
     */
    nyo("Nyoro"),
    /**
     * Nzima
     */
    nzi("Nzima"),
    /**
     * Occitan (post 1500), Provençal
     */
    oci("Occitan (post 1500)", "Provençal"),
    /**
     * Ojibwa
     */
    oji("Ojibwa"),
    /**
     * Oriya
     */
    ori("Oriya"),
    /**
     * Oromo
     */
    orm("Oromo"),
    /**
     * Osage
     */
    osa("Osage"),
    /**
     * Ossetian, Ossetic
     */
    oss("Ossetian", "Ossetic"),
    /**
     * Turkish, Ottoman (1500-1928)
     */
    ota("Turkish, Ottoman (1500-1928)"),
    /**
     * Otomian languages
     */
    oto("Otomian languages"),
    /**
     * Papuan languages
     */
    paa("Papuan languages"),
    /**
     * Pangasinan
     */
    pag("Pangasinan"),
    /**
     * Pahlavi
     */
    pal("Pahlavi"),
    /**
     * Pampanga, Kapampangan
     */
    pam("Pampanga", "Kapampangan"),
    /**
     * Panjabi, Punjabi
     */
    pan("Panjabi", "Punjabi"),
    /**
     * Papiamento
     */
    pap("Papiamento"),
    /**
     * Palauan
     */
    pau("Palauan"),
    /**
     * Persian, Old (ca.600-400 B.C.)
     */
    peo("Persian, Old (ca.600-400 B.C.)"),
    /**
     * Persian
     */
    per("Persian"),
    /**
     * Philippine languages
     */
    phi("Philippine languages"),
    /**
     * Phoenician
     */
    phn("Phoenician"),
    /**
     * Pali
     */
    pli("Pali"),
    /**
     * Polish
     */
    pol("Polish"),
    /**
     * Pohnpeian
     */
    pon("Pohnpeian"),
    /**
     * Portuguese
     */
    por("Portuguese"),
    /**
     * Prakrit languages
     */
    pra("Prakrit languages"),
    /**
     * Provençal, Old (to 1500)
     */
    pro("Provençal, Old (to 1500)"),
    /**
     * Pushto, Pashto
     */
    pus("Pushto", "Pashto"),
    /**
     * Quechua
     */
    que("Quechua"),
    /**
     * Rajasthani
     */
    raj("Rajasthani"),
    /**
     * Rapanui
     */
    rap("Rapanui"),
    /**
     * Rarotongan, Cook Islands Maori
     */
    rar("Rarotongan", "Cook Islands Maori"),
    /**
     * Romance languages
     */
    roa("Romance languages"),
    /**
     * Romansh
     */
    roh("Romansh"),
    /**
     * Romany
     */
    rom("Romany"),
    /**
     * Romanian, Moldavian, Moldovan
     */
    rum("Romanian", "Moldavian", "Moldovan"),
    /**
     * Rundi
     */
    run("Rundi"),
    /**
     * Aromanian, Arumanian, Macedo-Romanian
     */
    rup("Aromanian", "Arumanian", "Macedo-Romanian"),
    /**
     * Russian
     */
    rus("Russian"),
    /**
     * Sandawe
     */
    sad("Sandawe"),
    /**
     * Sango
     */
    sag("Sango"),
    /**
     * Yakut
     */
    sah("Yakut"),
    /**
     * South American Indian (Other)
     */
    sai("South American Indian (Other)"),
    /**
     * Salishan languages
     */
    sal("Salishan languages"),
    /**
     * Samaritan Aramaic
     */
    sam("Samaritan Aramaic"),
    /**
     * Sanskrit
     */
    san("Sanskrit"),
    /**
     * Sasak
     */
    sas("Sasak"),
    /**
     * Santali
     */
    sat("Santali"),
    /**
     * Sicilian
     */
    scn("Sicilian"),
    /**
     * Scots
     */
    sco("Scots"),
    /**
     * Selkup
     */
    sel("Selkup"),
    /**
     * Semitic languages
     */
    sem("Semitic languages"),
    /**
     * Irish, Old (to 900)
     */
    sga("Irish, Old (to 900)"),
    /**
     * Sign Languages
     */
    sgn("Sign Languages"),
    /**
     * Shan
     */
    shn("Shan"),
    /**
     * Sidamo
     */
    sid("Sidamo"),
    /**
     * Sinhala, Sinhalese
     */
    sin("Sinhala", "Sinhalese"),
    /**
     * Siouan languages
     */
    sio("Siouan languages"),
    /**
     * Sino-Tibetan languages
     */
    sit("Sino-Tibetan languages"),
    /**
     * Slavic languages
     */
    sla("Slavic languages"),
    /**
     * Slovak
     */
    slo("Slovak"),
    /**
     * Slovenian
     */
    slv("Slovenian"),
    /**
     * Southern Sami
     */
    sma("Southern Sami"),
    /**
     * Northern Sami
     */
    sme("Northern Sami"),
    /**
     * Sami languages
     */
    smi("Sami languages"),
    /**
     * Lule Sami
     */
    smj("Lule Sami"),
    /**
     * Inari Sami
     */
    smn("Inari Sami"),
    /**
     * Samoan
     */
    smo("Samoan"),
    /**
     * Skolt Sami
     */
    sms("Skolt Sami"),
    /**
     * Shona
     */
    sna("Shona"),
    /**
     * Sindhi
     */
    snd("Sindhi"),
    /**
     * Soninke
     */
    snk("Soninke"),
    /**
     * Sogdian
     */
    sog("Sogdian"),
    /**
     * Somali
     */
    som("Somali"),
    /**
     * Songhai languages
     */
    son("Songhai languages"),
    /**
     * Sotho, Southern
     */
    sot("Sotho, Southern"),
    /**
     * Spanish, Castilian
     */
    spa("Spanish", "Castilian"),
    /**
     * Sardinian
     */
    srd("Sardinian"),
    /**
     * Sranan Tongo
     */
    srn("Sranan Tongo"),
    /**
     * Serbian
     */
    srp("Serbian"),
    /**
     * Serer
     */
    srr("Serer"),
    /**
     * Nilo-Saharan languages
     */
    ssa("Nilo-Saharan languages"),
    /**
     * Swati
     */
    ssw("Swati"),
    /**
     * Sukuma
     */
    suk("Sukuma"),
    /**
     * Sundanese
     */
    sun("Sundanese"),
    /**
     * Susu
     */
    sus("Susu"),
    /**
     * Sumerian
     */
    sux("Sumerian"),
    /**
     * Swahili
     */
    swa("Swahili"),
    /**
     * Swedish
     */
    swe("Swedish"),
    /**
     * Classical Syriac
     */
    syc("Classical Syriac"),
    /**
     * Syriac
     */
    syr("Syriac"),
    /**
     * Tahitian
     */
    tah("Tahitian"),
    /**
     * Tai languages
     */
    tai("Tai languages"),
    /**
     * Tamil
     */
    tam("Tamil"),
    /**
     * Tatar
     */
    tat("Tatar"),
    /**
     * Telugu
     */
    tel("Telugu"),
    /**
     * Timne
     */
    tem("Timne"),
    /**
     * Tereno
     */
    ter("Tereno"),
    /**
     * Tetum
     */
    tet("Tetum"),
    /**
     * Tajik
     */
    tgk("Tajik"),
    /**
     * Tagalog
     */
    tgl("Tagalog"),
    /**
     * Thai
     */
    tha("Thai"),
    /**
     * Tibetan
     */
    tib("Tibetan"),
    /**
     * Tigre
     */
    tig("Tigre"),
    /**
     * Tigrinya
     */
    tir("Tigrinya"),
    /**
     * Tiv
     */
    tiv("Tiv"),
    /**
     * Tokelau
     */
    tkl("Tokelau"),
    /**
     * Klingon, tlhIngan-Hol
     */
    tlh("Klingon", "tlhIngan-Hol"),
    /**
     * Tlingit
     */
    tli("Tlingit"),
    /**
     * Tamashek
     */
    tmh("Tamashek"),
    /**
     * Tonga (Nyasa)
     */
    tog("Tonga (Nyasa)"),
    /**
     * Tonga (Tonga Islands)
     */
    ton("Tonga (Tonga Islands)"),
    /**
     * Tok Pisin
     */
    tpi("Tok Pisin"),
    /**
     * Tsimshian
     */
    tsi("Tsimshian"),
    /**
     * Tswana
     */
    tsn("Tswana"),
    /**
     * Tsonga
     */
    tso("Tsonga"),
    /**
     * Turkmen
     */
    tuk("Turkmen"),
    /**
     * Tumbuka
     */
    tum("Tumbuka"),
    /**
     * Tupi languages
     */
    tup("Tupi languages"),
    /**
     * Turkish
     */
    tur("Turkish"),
    /**
     * Altaic languages
     */
    tut("Altaic languages"),
    /**
     * Tuvalu
     */
    tvl("Tuvalu"),
    /**
     * Twi
     */
    twi("Twi"),
    /**
     * Tuvinian
     */
    tyv("Tuvinian"),
    /**
     * Udmurt
     */
    udm("Udmurt"),
    /**
     * Ugaritic
     */
    uga("Ugaritic"),
    /**
     * Uighur, Uyghur
     */
    uig("Uighur", "Uyghur"),
    /**
     * Ukrainian
     */
    ukr("Ukrainian"),
    /**
     * Umbundu
     */
    umb("Umbundu"),
    /**
     * Undetermined
     */
    und("Undetermined"),
    /**
     * Urdu
     */
    urd("Urdu"),
    /**
     * Uzbek
     */
    uzb("Uzbek"),
    /**
     * Vai
     */
    vai("Vai"),
    /**
     * Venda
     */
    ven("Venda"),
    /**
     * Vietnamese
     */
    vie("Vietnamese"),
    /**
     * Volapük
     */
    vol("Volapük"),
    /**
     * Votic
     */
    vot("Votic"),
    /**
     * Wakashan languages
     */
    wak("Wakashan languages"),
    /**
     * Walamo
     */
    wal("Walamo"),
    /**
     * Waray
     */
    war("Waray"),
    /**
     * Washo
     */
    was("Washo"),
    /**
     * Welsh
     */
    wel("Welsh"),
    /**
     * Sorbian languages
     */
    wen("Sorbian languages"),
    /**
     * Walloon
     */
    wln("Walloon"),
    /**
     * Wolof
     */
    wol("Wolof"),
    /**
     * Kalmyk, Oirat
     */
    xal("Kalmyk", "Oirat"),
    /**
     * Xhosa
     */
    xho("Xhosa"),
    /**
     * Yao
     */
    yao("Yao"),
    /**
     * Yapese
     */
    yap("Yapese"),
    /**
     * Yiddish
     */
    yid("Yiddish"),
    /**
     * Yoruba
     */
    yor("Yoruba"),
    /**
     * Yupik languages
     */
    ypk("Yupik languages"),
    /**
     * Zapotec
     */
    zap("Zapotec"),
    /**
     * Blissymbols, Blissymbolics, Bliss
     */
    zbl("Blissymbols", "Blissymbolics", "Bliss"),
    /**
     * Zenaga
     */
    zen("Zenaga"),
    /**
     * Standard Moroccan Tamazight
     */
    zgh("Standard Moroccan Tamazight"),
    /**
     * Zhuang, Chuang
     */
    zha("Zhuang", "Chuang"),
    /**
     * Zande languages
     */
    znd("Zande languages"),
    /**
     * Zulu
     */
    zul("Zulu"),
    /**
     * Zuni
     */
    zun("Zuni"),
    /**
     * No linguistic content, Not applicable
     */
    zxx("No linguistic content", "Not applicable"),
    /**
     * Zaza, Dimili, Dimli, Kirdki, Kirmanjki, Zazaki
     */
    zza("Zaza", "Dimili", "Dimli", "Kirdki", "Kirmanjki", "Zazaki");
    private static final HashMap<String, ISOCode> lookup = new HashMap<>();

    static {
        for (ISOCode code : values()) {
            lookup.put(code.name(), code);
            for (String languageName : code.languageNames) {
                lookup.put(languageName.toLowerCase(), code);
            }
        }
    }
    public final String[] languageNames;

    private ISOCode(String... languageNames) {
        this.languageNames = languageNames;
    }

    public String getFileName() {
        return "lang-" + name() + ".yml";
    }

    public static ISOCode findMatch(String match) {
        if (match.equalsIgnoreCase("new")) {
            return _new;
        }
        return lookup.get(match.toLowerCase());
    }

    public static void main(String[] args) {
        Iterator<ISOCode> itCodes = Arrays.asList(values()).iterator();
        while (itCodes.hasNext()) {
            ISOCode code = itCodes.next();
            StringBuilder languagesHelp = new StringBuilder();
            StringBuilder languagesList = new StringBuilder();
            Iterator<String> itLangNames = Arrays.asList(code.languageNames).iterator();
            while (itLangNames.hasNext()) {
                String languageName = itLangNames.next();
                languagesHelp.append(languageName);
                languagesList.append('"').append(languageName).append('"');
                if (itLangNames.hasNext()) {
                    languagesHelp.append(", ");
                    languagesList.append(", ");
                }
            }
            System.out.println("/**");
            System.out.println(" * " + languagesHelp.toString());
            System.out.println(" */");
            System.out.print(code.name() + "(" + languagesList.toString() + ")");
            if (itCodes.hasNext()) {
                System.out.println(",");
            } else {
                System.out.println(";");
            }
        }
    }
}
