package ui.strings

import com.sdercolin.utaformatix.data.UtaFormatixDataVersion
import io.MusicXml.MUSIC_XML_VERSION
import ui.strings.Language.English
import ui.strings.Language.French
import ui.strings.Language.Japanese
import ui.strings.Language.Russian
import ui.strings.Language.SimplifiedChinese
import ui.strings.Language.Indonesian

enum class Strings(
    val en: String,
    val ja: String,
    val zhCN: String,
    val ru: String = en,
    val fr: String = en,
    val id: String = en,
) {
    LanguageDisplayName(
        en = English.displayName,
        ja = Japanese.displayName,
        zhCN = SimplifiedChinese.displayName,
        ru = Russian.displayName,
        fr = French.displayName,
    ),
    ReportFeedbackTooltip(
        en = "Send feedback",
        ja = "フィードバックを送信",
        zhCN = "提交反馈",
        ru = "Отправить отзыв",
        fr = "Envoyer vos retours",
        id = "Beri Saran",
    ),
    FrequentlyAskedQuestionTooltip(
        en = "Frequently Asked Questions",
        ja = "よくある質問",
        zhCN = "常见问题解答",
        ru = "Часто задаваемые вопросы",
        fr = "Questions Fréquemment Posées",
        id = "Pertanyaan yang Sering Diajukan",
    ),
    ImportProjectCaption(
        en = "Import Project",
        ja = "プロジェクトをインポート",
        zhCN = "导入工程",
        ru = "Импортировать проект",
        fr = "Importation de projet",
        id = "Impor Proyek",
    ),
    SelectOutputFormatCaption(
        en = "Select Output Format",
        ja = "出力形式を選ぶ",
        zhCN = "选择输出格式",
        ru = "Выберите выходной формат",
        fr = "Sélectionner le Format de Sortie",
        id = "Pilih Format Keluar",
    ),
    ConfigurationEditorCaption(
        en = "Configuration",
        ja = "設定",
        zhCN = "设置",
        ru = "Конфигурация",
        fr = "Configuration",
        id = "Konfigurasi",
    ),
    ExportCaption(
        en = "Export",
        ja = "エクスポート",
        zhCN = "导出",
        ru = "Экспорт",
        fr = "Exportation",
        id = "Ekspor",
    ),
    ExporterTitleSuccess(
        en = "Process finished successfully.",
        ja = "処理に成功しました。",
        zhCN = "处理已完成。",
        ru = "Процесс успешно завершен",
        fr = "Processus terminé avec succès.",
        id = "Proses Berhasil.",
    ),
    LyricsTypeUnknown(
        en = "Unknown",
        ja = "不明",
        zhCN = "未知",
        ru = "Неизвестно",
        fr = "Inconnu",
        id = "Tidak Dketahui",
    ),
    LyricsTypeRomajiCV(
        en = "Romaji CV",
        ja = "単独音（ローマ字）",
        zhCN = "罗马字单独音",
        ru = "Ромадзи CV",
        fr = "Romaji CV",
        id = "CV Romaji",
    ),
    LyricsTypeRomajiVCV(
        en = "Romaji VCV",
        ja = "連続音（ローマ字）",
        zhCN = "罗马字连续音",
        ru = "Ромадзи VCV",
        fr = "Romaji VCV",
        id = "VCV Romaji",
    ),
    LyricsTypeKanaCV(
        en = "Kana CV",
        ja = "単独音（ひらがな）",
        zhCN = "假名单独音",
        ru = "Кана CV",
        fr = "Kana CV",
        id = "CV Kana",
    ),
    LyricsTypeKanaVCV(
        en = "Kana VCV",
        ja = "連続音（ひらがな）",
        zhCN = "假名连续音",
        ru = "Кана VCV",
        fr = "Kana VCV",
        id = "VCV Kana",
    ),
    JapaneseLyricsConversion(
        en = "Cleanup and convert lyrics (only for Japanese lyrics)",
        ja = "歌詞のSuffix除去・変換（日本語歌詞のみ対応）",
        zhCN = "清理并转换歌词（仅日语）",
        ru = "Очистка и преобразование текстов (только для японских текстов)",
        fr = "Nettoyage et conversion des paroles (seulement pour les paroles en japonais)",
        id = "Bersihkan dan konvert lirik (hanya untuk lirik Jepang)",
    ),
    FromLyricsTypeLabel(
        en = "Original lyrics type (analysis result: {{type}})",
        ja = "変換元の歌詞タイプを選択（分析結果：{{type}}）",
        zhCN = "原歌词类型（分析结果为：{{type}}）",
        ru = "Исходный тип текстов (результат анализа: {{type}})",
        fr = "Type de paroles originales (résultat de l'analyse : {{type}})",
        id = "Jenis lirik asli (hasil analisis: {{type}})",
    ),
    ToLyricsTypeLabel(
        en = "Target lyrics type",
        ja = "変換先の歌詞タイプを選択",
        zhCN = "目标歌词类型",
        ru = "Целевой тип текстов",
        fr = "Type de paroles cible",
        id = "Jenis lirik target",
    ),
    ChinesePinyinConversion(
        en = "Convert lyrics in Chinese characters to Pinyin",
        ja = "中国語歌詞（漢字）を Pinyin に変換",
        zhCN = "将中文汉字歌词转换为拼音",
        ru = "Преобразовать тексты на китайском языке в пиньинь",
        fr = "Convertir les paroles en caractères chinois en pinyin",
        id = "Konversi lirik dalam karakter Cina ke Pinyin",
    ),
    LyricsReplacement(
        en = "Replace lyrics",
        ja = "歌詞を置き換える",
        zhCN = "替换歌词",
        ru = "Заменить тексты",
        fr = "Remplacer les paroles",
        id = "Ganti lirik",
    ),
    LyricsReplacementDescription(
        en = "Replace lyrics that pass the filter.\n- Presets are loaded according to original format and " +
            "target format.\n- If you use \"{{regex}}\" as the \"{{matchType}}\", " +
            "you can use placeholders like \"\$1\", \"$2\", etc. in \"{{to}}\" to fill in the captured groups.",
        ja = "フィルターに合致する歌詞を置き換える。\n・一部のフォーマットではプリセットが自動的に適用されます。\n" +
            "・「{{matchType}}」で「{{regex}}」使用する場合、「{{to}}」に「$1」、「$2」などのプレースホルダーを用いて、" +
            "キャプチャされたグループを入れることができます。",
        zhCN = "替换可通过过滤器的歌词。\n・转换部分格式时，预设将会被加载。\n・在使用「{{regex}}」的「{{matchType}}」时" +
            "，您可以在「{{to}}」中使用「$1」、「$2」等占位符来填充被捕获的组。",
        ru = "Замените тексты, которые проходят фильтр.\n- Пресеты загружаются в соответсвии с " +
            "исходным и целевым форматом.\n- Если вы используете \"{{regex}}\" в качестве " +
            "\"{{matchType}}\", вы можете использовать заполнители типа \"\$1\", \"$2\", и т.д. " +
            "в \"{{to}}\" для заполнения захваченных групп.",
        fr = "Remplacez les paroles qui passent le filtre.\n- Les préréglages sont chargés en fonction " +
            "du format d'origine et du format cible. Si vous utilisez \"{{regex}}\" comme \"{{matchType}}\", " +
            "vous pouvez utiliser des caractères de remplacement comme \"\$1\", \"$2\", etc. dans \"{{to}}\" " +
            "pour remplir les groupes capturés.",
        id = "Ganti lirik yang lolos filter.\n- Preset dimuat menurut format aslinya dan " +
            "format target.\n- Jika Anda menggunakan \"{{regex}}\" sebagai \"{{matchType}}\", " +
            "Anda dapat menggunakan placeholder seperti \"\$1\", \"$2\", dll. di \"{{ke}}\" untuk mengisi grup yang diambil.",
    ),
    LyricsReplacementItemLabel(
        en = "#{{number}}",
        ja = "#{{number}}",
        zhCN = "#{{number}}",
        ru = "#{{number}}",
        fr = "#{{number}}",
        id = "#{{number}}",
    ),
    LyricsReplacementAddItemButton(
        en = "Add replacement rule",
        ja = "置換ルールを追加",
        zhCN = "添加替换规则",
        ru = "Добавить правило переноса",
        fr = "Ajouter une règle de remplacement",
        id = "Tambahkan aturan pengganti",
    ),
    LyricsReplacementFilterTypeLabel(
        en = "Filter type",
        ja = "フィルタータイプ",
        zhCN = "过滤器类型",
        ru = "Тип фильтра",
        fr = "Type de filtre",
        id = "Jenis saringan",
    ),
    LyricsReplacementFilterTypeNone(
        en = "None",
        ja = "なし",
        zhCN = "无",
        ru = "Нет",
        fr = "Aucun",
        id = "Tidak",
    ),
    LyricsReplacementFilterTypeExact(
        en = "Exact",
        ja = "完全一致",
        zhCN = "完全匹配",
        ru = "Точный",
        fr = "Exact",
        id = "Tepat",
    ),
    LyricsReplacementFilterTypeContaining(
        en = "Containing",
        ja = "含む",
        zhCN = "包含",
        ru = "Содержащий",
        fr = "Contenant",
        id = "Berisi",
    ),
    LyricsReplacementFilterTypePrefix(
        en = "Prefix",
        ja = "前方一致",
        zhCN = "前缀",
        ru = "Префикс",
        fr = "Préfixe",
        id = "Awalan",
    ),
    LyricsReplacementFilterTypeSuffix(
        en = "Suffix",
        ja = "後方一致",
        zhCN = "后缀",
        ru = "Суффикс",
        fr = "Suffixe",
        id = "Akhiran",
    ),
    LyricsReplacementFilterTypeRegex(
        en = "Regex",
        ja = "正規表現",
        zhCN = "正则表达式",
        ru = "Регулярное выражение",
        fr = "Regex",
        id = "Regeks",
    ),
    LyricsReplacementFilterTextLabel(
        en = "Filter",
        ja = "フィルター",
        zhCN = "过滤器",
        ru = "Фильтр",
        fr = "Filtre",
        id = "Filter",
    ),
    LyricsReplacementMatchTypeLabel(
        en = "Match type",
        ja = "マッチタイプ",
        zhCN = "匹配类型",
        ru = "Тип совпадения",
        fr = "Type de match",
        id = "Jenis pencocokan",
    ),
    LyricsReplacementMatchTypeAll(
        en = "All",
        ja = "全部",
        zhCN = "全部",
        ru = "Все",
        fr = "Tout",
        id = "Semua",
    ),
    LyricsReplacementMatchTypeExact(
        en = "Exact",
        ja = "完全一致",
        zhCN = "完全匹配",
        ru = "Точный",
        fr = "Exact",
        id = "Tepat",
    ),
    LyricsReplacementMatchTypeRegex(
        en = "Regex",
        ja = "正規表現",
        zhCN = "正则表达式",
        ru = "Регулярное выражение",
        fr = "Regex",
        id = "Regeks",
    ),
    LyricsReplacementFromTextLabel(
        en = "From",
        ja = "置換元",
        zhCN = "替换源",
        ru = "Из",
        fr = "De",
        id = "Dari",
    ),
    LyricsReplacementToTextLabel(
        en = "To",
        ja = "置換先",
        zhCN = "替换为",
        ru = "До",
        fr = "À",
        id = "Ke",
    ),
    ConvertPitchData(
        en = "Convert pitch parameters",
        ja = "ピッチパラメータを変換",
        zhCN = "转换音高参数",
        ru = "Конвертировать параметры питча",
        fr = "Convertir les paramètres de hauteur",
        id = "Konversi parameter pitch",
    ),
    ConvertPitchDataDescription(
        en = "It may take some time to process with this option.",
        ja = "処理に時間がかかることがあります。",
        zhCN = "该选项可能会增加处理时间。",
        ru = "Обработка с помощью этого параметра может занять некоторое время.",
        fr = "Le traitement peut prendre un certain temps avec cette option.",
        id = "Mungkin perlu waktu untuk memproses dengan opsi ini.",
    ),
    ProjectZoom(
        en = "Zoom in/out project",
        ja = "プロジェクトをズームイン・ズームアウト",
        zhCN = "缩放工程",
        ru = "Приблизить/отдалить проект",
        fr = "Zoom avant/arrière du projet",
        id = "Perbesar/perkecil proyek",
    ),
    ProjectZoomDescription(
        en = "Change Bpm and notes in parallel so that the actual singing speed is kept. For example," +
            "with factor 2, 60 bpm becomes 120 bpm and all notes become twice the length",
        ja = "実際の速度を変更しないようBpmやノートなどを同時に変更します。例えば、60 bmpの曲に因子2をかけると、" +
            "120 bpm になり、すべてのノートの長さも二倍になります。",
        zhCN = "在不改变实际曲速的前提下同时改变Bpm数值与音符长度。例如，在60 bpm的乐曲中使用2倍的缩放，则乐曲变为120bpm，" +
            "同时所有音符的长度也翻倍。",
        ru = "Изменение частоты ударов в минуту и нот параллельно, чтобы сохранить фактическую скорость пения." +
            " Например, с коэффициентом 2 60 ударов в минуту становятся 120 ударов в минуту," +
            " и все ноты становятся в два раза длиннее",
        fr = "Changez les bpm et les notes en parallèle afin de conserver la vitesse réelle du chant." +
            " Par exemple, avec le facteur 2, 60 bpm devient 120 bpm," +
            " et toutes les notes deviennent deux fois plus longues.",
        id = "Ubah Bpm dan not secara paralel sehingga kecepatan menyanyi yang sebenarnya tetap terjaga. Misalnya," +
            "dengan faktor 2, 60 bpm menjadi 120 bpm dan semua nada menjadi dua kali panjangnya",
    ),
    ProjectZoomWarning(
        en = "Current settings may be destructive because some time signatures have to be moved to measure heads.",
        ja = "この設定ではプロジェクトを適切に変換できないことがあります。一部の拍子記号を小節の始まりに移動させることになります。",
        zhCN = "该设定可能无法正确转换本工程。一部分的节拍记号将被移动到最近的小节的开始位置。",
        ru = "Текущие настройки могут быть разрушительными," +
            " поскольку для измерения головок необходимо переместить некоторые временные сигнатуры.",
        fr = "Les paramètres actuels peuvent être destructeurs," +
            " car certaines signatures temporelles seront déplacées au début de la mesure.",
        id = "Pengaturan saat ini mungkin merusak karena beberapa tanda waktu harus dipindahkan untuk mengukur head.",
    ),
    ProjectZooLabel(
        en = "Factor",
        ja = "因子",
        zhCN = "系数",
        ru = "Коэффицент",
        fr = "Coefficient",
        id = "Faktor",
    ),
    NextButton(
        en = "Next",
        ja = "次へ",
        zhCN = "下一步",
        ru = "Далее",
        fr = "Suivant",
        id = "Selanjutnya",
    ),
    CancelButton(
        en = "Cancel",
        ja = "キャンセル",
        zhCN = "取消",
        ru = "Назад",
        fr = "Annuler",
        id = "Batal",
    ),
    ReportButton(
        en = "Report",
        ja = "問題を報告",
        zhCN = "提交报告",
        ru = "Сообщить",
        fr = "Signaler",
        id = "Laporkan",
    ),
    ImportFileDescription(
        en = "Drop files or Click to import",
        ja = "ファイルをドロップするか、クリックしてインポート",
        zhCN = "拖放文件或点击导入",
        ru = "Перетащите файлы или нажмите, чтобы импортировать",
        fr = "Déposer les fichiers ou Cliquer ici pour importer",
        id = "Jatuhkan file atau Klik untuk mengimpor",
    ),
    ImportFileSubDescription(
        en = "Supported file types: VSQX, VPR, VSQ, MID(VOCALOID), USTs," +
            " USTX, CCS, MUSICXML, XML, SVP, S5P, DV, PPSF(NT), UFDATA",
        ja = "サポートされているファイル形式：VSQX、VPR、VSQ、MID（VOCALOID）、UST（複数可）、" +
            "USTX、CCS、MUSICXML、XML、SVP、S5P、DV、PPSF（NT）、UFDATA",
        zhCN = "支持的文件类型：VSQX、VPR、VSQ、MID（VOCALOID）、UST（允许复数个）、" +
            "USTX、CCS、MUSICXML、XML、SVP、S5P、DV、PPSF（NT）、UFDATA",
        ru = "Поддерживаемые форматы файлов: VSQx, VPR, VSQ, MID (VOCALOID), UST," +
            " USTX, CCS, MusicXML, XML, SVP, S5P, DV, PPSF(NT), UFDATA",
        fr = "Types de fichiers pris en charge : VSQX, VPR, VSQ, MID(VOCALOID), USTs," +
            " USTX, CCS, MUSICXML, XML, SVP, S5P, DV, PPSF(NT), UFDATA",
        id = "Jenis file yang didukung: VSQX, VPR, VSQ, MID(VOCALOID), USTs," +
            " USTX, CCS, MUSICXML, XML, SVP, S5P, DV, PPSF(NT), UFDATA",
    ),
    UnsupportedFileTypeImportError(
        en = "Unsupported file type",
        ja = "サポートされていないファイル形式です",
        zhCN = "不支持的文件类型",
        ru = "Неподдерживаемый формат файла",
        fr = "Type de fichier non supporté",
        id = "Jenis file tidak didukung",
    ),
    UnsupportedStandardMidiError(
        en = "Standard MIDI file format is not supported",
        ja = "Standard MIDIファイル形式はサポートされていません",
        zhCN = "不支持标准MIDI文件格式",
        ru = "Стандартный формат MIDI-файла не поддерживается",
        fr = "Le format de fichier MIDI standard n'est pas pris en charge",
        id = "Format file MIDI standar tidak didukung",
    ),
    UnsupportedLegacyPpsfError(
        en = "Legacy ppsf file format is not supported (only ppsf for Piapro Studio NT is supported)",
        ja = "レガシー ppsf ファイル形式はサポートされていません（Piapro Studio NTのみサポートされています）",
        zhCN = "不支持旧版ppsf文件格式（仅支持 ppsf for Piapro Studio NT）",
        ru = "Устаревший формат файла ppsf не поддерживается. (Поддерживается только ppsf от Piapro Studio NT)",
        fr = "Le format de fichier ppsf hérité n'est pas pris en charge (seul ppsf pour Piapro Studio NT " +
            "est pris en charge)",
        id = "Format file ppsf lama tidak didukung (hanya ppsf untuk Piapro Studio NT yang didukung)",
    ),
    MultipleFileImportError(
        en = "Multiple files of {{format}} could not be imported in one go",
        ja = "複数の{{format}}ファイルを一度にインポートすることはできません",
        zhCN = "无法同时导入多个{{format}}文件",
        ru = "Несколько файлов {{format}} не удалось импортировать за один раз",
        fr = "Plusieurs fichiers de {{format}} n'ont pas pu être importés en une seule fois",
        id = "Beberapa file {{format}} tidak dapat diimpor sekaligus",
    ),
    ImportErrorDialogTitle(
        en = "Failed to import the project",
        ja = "プロジェクトのインポートに失敗しました",
        zhCN = "无法导入该工程",
        ru = "Не удалось импортировать проект",
        fr = "Échec de l'importation du projet",
        id = "Gagal mengimpor proyek",
    ),
    ProcessErrorDialogTitle(
        en = "An error happened during the process",
        ja = "処理中に下記のエラーが発生しました",
        zhCN = "在处理中发生了以下错误",
        ru = "Во время процесса произошла ошибка",
        fr = "Une erreur s'est produite pendant le processus",
        id = "Terjadi kesalahan selama proses",
    ),
    ErrorDialogDescription(
        en = "If you find any problems, please help us collect error information" +
            " for better performance of this application by submitting a feedback report.",
        ja = "サービス向上のためにエラー情報を収集しております。問題を発見した場合、フィードバックにご協力をお願いします。",
        zhCN = "如您在使用中发现问题，您可以向我们提交反馈表单。感谢您对本应用的改善所提供的帮助！",
        ru = "Если вы обнаружите какие-либо проблемы, пожалуйста, помогите нам собрать информацию об ошибках" +
            "  для повышения производительности этого приложения, отправив отчет об обратной связи.",
        fr = "Si vous rencontrez des problèmes, aidez-nous à collecter des informations sur les erreurs" +
            " pour une meilleure performance de cette application en soumettant" +
            " un rapport de vos retours. (SEULEMENT EN ANGLAIS)",
        id = "Jika Anda menemukan masalah, tolong bantu kami mengumpulkan informasi kesalahan" +
            " untuk kinerja yang lebih baik dari aplikasi ini dengan mengirimkan laporan umpan balik.",
    ),
    ReportUrl(
        en = "https://forms.gle/3Es3ZomcYKNHWBvp6",
        ja = "https://forms.gle/kDY9chZBjGATXqpE8",
        zhCN = "https://forms.gle/nJVdrsfwMhbNXEYUA",
        ru = "https://forms.gle/vTNUE78QzURB7YcBA",
        fr = "https://forms.gle/3Es3ZomcYKNHWBvp6",
        id = "https://forms.gle/3Es3ZomcYKNHWBvp6",
    ),
    FaqUrl(
        en = "https://gist.githubusercontent.com/sdercolin/4d835e7e201a39504f5321f67d254209/raw",
        ja = "https://gist.githubusercontent.com/sdercolin/f1de7c1f7a894f1fc8f77b17f3e8f77d/raw",
        zhCN = "https://gist.githubusercontent.com/sdercolin/1a940a1357e2a6a5c10561482536bdba/raw",
        ru = "https://gist.githubusercontent.com/KagamineP/d5837aa5f1b3be3b05aed5cd63b2afe2/raw",
        fr = "https://gist.githubusercontent.com/Exorcism0666/29e1c09eb471bccc270cc0a02992a0b1/raw",
        id = "https://gist.githubusercontent.com/sdercolin/4d835e7e201a39504f5321f67d254209/raw",
    ),
    ReleaseNotesUrl(
        en = "https://gist.githubusercontent.com/sdercolin/512db280480072f22cf1d462401eb1a0/raw",
        ja = "https://gist.githubusercontent.com/sdercolin/512db280480072f22cf1d462401eb1a0/raw",
        zhCN = "https://gist.githubusercontent.com/sdercolin/512db280480072f22cf1d462401eb1a0/raw",
        ru = "https://gist.githubusercontent.com/sdercolin/512db280480072f22cf1d462401eb1a0/raw",
        fr = "https://gist.githubusercontent.com/sdercolin/512db280480072f22cf1d462401eb1a0/raw",
        id = "https://gist.githubusercontent.com/sdercolin/512db280480072f22cf1d462401eb1a0/raw",
    ),
    GoogleAnalyticsUsageInfoUrl(
        en = "https://gist.githubusercontent.com/sdercolin/b5d4cf81434ea381d8836e0015681029/raw",
        ja = "https://gist.githubusercontent.com/sdercolin/b5d4cf81434ea381d8836e0015681029/raw",
        zhCN = "https://gist.githubusercontent.com/sdercolin/b5d4cf81434ea381d8836e0015681029/raw",
        id = "https://gist.githubusercontent.com/sdercolin/b5d4cf81434ea381d8836e0015681029/raw",
    ),
    ImportWarningTitle(
        en = "The following exceptions happened during the import process.",
        ja = "インポート中に下記の例外が発生しました。",
        zhCN = "导入过程中出现了下列异常。",
        ru = "В процессе импорта произошли следующие исключения.",
        fr = "Les exceptions suivantes se sont produites pendant le processus d'importation.",
        id = "Pengecualian berikut terjadi selama proses impor.",
    ),
    ImportWarningTempoNotFound(
        en = "- No tempo labels found in the imported project.",
        ja = "- テンポ記号が見つかりませんでした。",
        zhCN = "- 在导入的工程中未找到速度记号。",
        ru = "- Метки темпа не найдены в импортированном проекте.",
        fr = "- Aucun tempo n'a été trouvée dans le projet importé.",
        id = "- Tidak ada label tempo yang ditemukan di proyek yang diimpor.",
    ),
    ImportWarningTempoIgnoredInFile(
        en = "- Tempo label ({{bpm}}) at tick {{tick}} in file [{{file}}] was ignored.",
        ja = "- ファイル[{{file}}]の tick {{tick}} にあるテンポ記号（{{bpm}}）を読み込めませんでした。",
        zhCN = "- 未能读取文件[{{file}}]中 tick {{tick}} 处的速度记号（{{bpm}}）。",
        ru = "- Метка темпа ({{bpm}}) на отметке {{tick}} в файле [{{file}}] была проигнорирована.",
        fr = "- Le tempo ({{bpm}}) au tick {{tick}} du fichier [{{file}}] a été ignorée.",
        id = "- Tempo label ({{bpm}}) pada centang {{tick}} di file [{{file}}] diabaikan.",
    ),
    ImportWarningTempoIgnoredInTrack(
        en = "- Tempo label ({{bpm}}) at tick {{tick}} in Track {{number}}: [{{name}}] was ignored.",
        ja = "- トラック{{number}}：[{{name}}]のtick {{tick}}にあるテンポ記号（{{bpm}}）を読み込めませんでした。",
        zhCN = "- 未能读取音轨{{number}}：[{{name}}]中tick {{tick}}处的速度记号（{{bpm}}）。",
        ru = "- Метка темпа ({{bpm}}) на отметке {{tick}} в треке {{number}}: [{{name}}] была проигнорирована.",
        fr = "- Le tempo ({{bpm}}) au tick {{tick}} de la piste {{number}}: [{{name}}] a été ignoré.",
        id = "- Tempo label ({{bpm}}) di centang {{tick}} di Track {{number}}: [{{name}}] diabaikan.",
    ),
    ImportWarningTempoIgnoredInPreMeasure(
        en = "- Tempo label ({{bpm}}) in pre-measures was ignored.",
        ja = "- プリメジャーにあるテンポ記号（{{bpm}}）を読み込めませんでした。",
        zhCN = "- 未能读取前置小节中的速度记号（{{bpm}}）。",
        ru = "- Метка темпа ({{bpm}}) в предварительных мерах была проигнорирована.",
        fr = "- Le tempo ({{bpm}}) dans les pré-mesures a été ignorée.",
        id = "- Tempo label ({{bpm}}) di pra-pengukuran diabaikan.",
    ),
    ImportWarningTimeSignatureNotFound(
        en = "- No time signature labels found in the imported project.",
        ja = "- 拍子記号が見つかりませんでした。",
        zhCN = "- 在导入的工程中未找到节拍记号。",
        ru = "- В импортированном проекте не найдено меток временных сигнатур.",
        fr = "- Aucune signature rythmique n'a trouvé dans le projet importé.",
        id = "- Tidak ada label tanda waktu yang ditemukan dalam proyek yang diimpor.",
    ),
    ImportWarningTimeSignatureIgnoredInTrack(
        en = "- Time signature label ({{timeSignature}}) at measure {{measure}}" +
            " in Track {{number}}: [{{name}}] was ignored.",
        ja = "- トラック{{number}}：[{{name}}]の小節{{measure}}にある拍子記号（{{timeSignature}}）を読み込めませんでした。",
        zhCN = "- 未能读取音轨{{number}}: [{{name}}]中小节{{measure}}处的节拍记号（{{timeSignature}}）。",
        ru = "- Метка временной сигнатуры ({{TimeSignature}}) при измерении {{measure}}" +
            " в треке {{number}}: [{{name}}] была проигнорирована.",
        fr = "La signature rythmique ({{timeSignature}}) à la mesure {{measure}}" +
            " de la piste {{number}} : [{{name}}]] a été ignoré.",
        id = "- Label tanda waktu ({{timeSignature}}) pada ukuran {{measure}}" +
            " di Trek {{number}}: [{{name}}] diabaikan.",
    ),
    ImportWarningTimeSignatureIgnoredInPreMeasure(
        en = "- Time signature label ({{timeSignature}}) in pre-measures was ignored.",
        ja = "- プリメジャーにある拍子記号（{{timeSignature}}）を読み込めませんでした。",
        zhCN = "- 未能读取前置小节中的节拍记号（{{timeSignature}}）。",
        ru = "- Метка временной сигнатуры ({{timeSignature}}) в предварительных мерах была проигнорирована.",
        fr = "- La signature rythmique ({{timeSignature}}) dans les pré-mesures a été ignorée.",
        id = "- Label tanda waktu ({{timeSignature}}) di pra-pengukuran diabaikan.",
    ),
    ImportWarningIncompatibleFormatSerializationVersion(
        en = "- Some data may have been lost because the input file has an incompatible serialization version:" +
            " {{dataVersion}}. Current version is {{currentVersion}}.",
        ja = "- 入力ファイルのシリアライゼーションバージョン {{dataVersion}} への互換性がないため、すべてのデータを読み込んでいない" +
            "可能性があります。現在のバージョンは {{currentVersion}} です。",
        zhCN = "- 因为导入的文件的序列化版本 {{dataVersion}} 与当前版本不兼容，部分数据可能丢失。当前版本：{{currentVersion}}。",
        id = "- Beberapa data mungkin hilang karena file input memiliki versi serialisasi yang tidak kompatibel:" +
            " {{dataVersion}}. Versi saat ini adalah {{currentVersion}}.",
    ),
    VsqxFormatDescription(
        en = "Project for VOCALOID4",
        ja = "VOCALOID4 プロジェクト",
        zhCN = "VOCALOID4 工程",
        ru = "Проект для VOCALOID4",
        fr = "Projet pour VOCALOID4",
        id = "Proyek untuk VOCALOID4",
    ),
    VprFormatDescription(
        en = "Project for VOCALOID5",
        ja = "VOCALOID5 プロジェクト",
        zhCN = "VOCALOID5 工程",
        ru = "Проект для VOCALOID5",
        fr = "Projet pour VOCALOID5",
        id = "Proyek untuk VOCALOID5",
    ),
    UstFormatDescription(
        en = "Project for UTAU",
        ja = "UTAU プロジェクト",
        zhCN = "UTAU 工程",
        ru = "Проект для UTAU",
        fr = "Projet pour UTAU",
        id = "Proyek untuk UTAU",
    ),
    UstxFormatDescription(
        en = "Project for OpenUtau",
        ja = "OpenUtau プロジェクト",
        zhCN = "OpenUtau 工程",
        ru = "Проект для OpenUtau",
        fr = "Projet pour OpenUtau",
        id = "Proyek untuk OpenUtau",
    ),
    CcsFormatDescription(
        en = "Project for CeVIO Creative Studio",
        ja = "CeVIO Creative Studio プロジェクト",
        zhCN = "CeVIO Creative Studio 工程",
        ru = "Проект для CeVIO Creative Studio",
        fr = "Projet pour CeVIO Creative Studio",
        id = "Proyek untuk CeVIO Creative Studio",
    ),
    SvpFormatDescription(
        en = "Project for Synthesizer V Studio",
        ja = "Synthesizer V Studio プロジェクト",
        zhCN = "Synthesizer V Studio 工程",
        ru = "Проект для Synthesizer V Studio",
        fr = "Projet pour Synthesizer V Studio",
        id = "Proyek untuk Synthesizer V Studio",
    ),
    S5pFormatDescription(
        en = "Project for Synthesizer V",
        ja = "Synthesizer V プロジェクト",
        zhCN = "Synthesizer V 工程",
        ru = "Проект для Synthesizer V",
        fr = "Projet pour Synthesizer V",
        id = "Proyek untuk Synthesizer V",
    ),
    MusicXmlFormatDescription(
        en = "MusicXML $MUSIC_XML_VERSION (CeVIO style)",
        ja = "MusicXML $MUSIC_XML_VERSION （CeVIO基準に準じる）",
        zhCN = "MusicXML $MUSIC_XML_VERSION（参照CeVIO标准）",
        ru = "MusicXML $MUSIC_XML_VERSION (стиль CeVIO)",
        fr = "MusicXML $MUSIC_XML_VERSION (style CeVIO)",
        id = "MusicXML $MUSIC_XML_VERSION (gaya CeVIO)",
    ),
    DvFormatDescription(
        en = "Project for DeepVocal",
        ja = "DeepVocal プロジェクト",
        zhCN = "DeepVocal 工程",
        ru = "Проект для DeepVocal",
        fr = "Projet pour DeepVocal",
        id = "Proyek untuk DeepVocal",
    ),
    VsqFormatDescription(
        en = "Project for VOCALOID2",
        ja = "VOCALOID2 プロジェクト",
        zhCN = "VOCALOID2 工程",
        ru = "Проект для VOCALOID2",
        fr = "Projet pour VOCALOID2",
        id = "Proyek untuk VOCALOID2",
    ),
    VocaloidMidiFormatDescription(
        en = "Project for VOCALOID1",
        ja = "VOCALOID1 プロジェクト",
        zhCN = "VOCALOID1 工程",
        ru = "Проект для VOCALOID1",
        fr = "Projet pour VOCALOID1",
        id = "Proyek untuk VOCALOID1",
    ),
    UfDataFormatDescription(
        en = "UtaFormatix Data Format (v$UtaFormatixDataVersion)",
        ja = "UtaFormatix データ形式（v$UtaFormatixDataVersion）",
        zhCN = "UtaFormatix 数据格式（v$UtaFormatixDataVersion）",
        id = "Format Data UtaFormatix (v$UtaFormatixDataVersion)",
    ),
    ExportButton(
        en = "Export",
        ja = "エクスポート",
        zhCN = "导出",
        ru = "Экспортировать",
        fr = "Exporter",
        id = "Ekspor",
    ),
    RestartButton(
        en = "Back to the beginning",
        ja = "プロジェクトインポート画面に戻る",
        zhCN = "回到初始页面",
        ru = "Вернуться на главную",
        fr = "Retour au début",
        id = "Kembali ke awal",
    ),
    ExportNotificationPhonemeResetRequiredVSQ(
        en = "Phonemes of all notes were set to \"a\". Please reset them to make it sound correctly.",
        ja = "全てのノートの発音記号が\"a\"に設定されました。正確に発音させるには発音記号をリセットしてください。",
        zhCN = "所有音符的音素都被设为了\"a\"。请重置音素以使其正确发音。",
        ru = "Фонемы всех нот были установлены на \"a\"." +
            " Пожалуйста, сбросьте их, чтобы они звучали правильно.",
        fr = "Les phonèmes de toutes les notes ont été réglés sur \"a\"." +
            " Veuillez les réinitialiser pour que le son soit correct.",
        id = "Fonem semua nada disetel ke \"a\". Harap setel ulang agar terdengar benar.",
    ),
    ExportNotificationPhonemeResetRequiredV4(
        en = "Phonemes of all notes were set to \"a\"." +
            " Please use \"Lyrics\" -> \"Convert Phonemes\" in the menu of VOCALOID4 to reset them.",
        ja = "全てのノートの発音記号が\"a\"に設定されました。" +
            "VOCALOID4のメニューから「歌詞」->「発音記号変換」機能で発音記号をリセットしてください。",
        zhCN = "所有音符的音素都被设为了\"a\"。请使用VOCALOID4菜单中的「歌词」->「音位变换」功能来重置音素。",
        ru = "Фонемы всех нот были установлены на \"a\"." +
            " Пожалуйста, воспользуйтесь \"Lyrics\" -> \"Convert Phonemes\" в меню VOCALOID4 чтобы сбросить их.",
        fr = "Les phonèmes de toutes les notes ont été réglés sur \"a\"." +
            " Veuillez utiliser \"Lyrics\" -> \"Convert Phonemes\" dans le menu de VOCALOID4 pour les réinitialiser.",
        id = "Fonem semua nada disetel ke \"a\"." +
            " Silakan gunakan \"Lyrics\" -> \"Convert Phonemes\" di menu VOCALOID4 untuk meresetnya.",
    ),
    ExportNotificationPhonemeResetRequiredV5(
        en = "Phonemes of all notes were set to \"a\". Please use \"Job\" -> \"Convert Phonemes to Match Languages\"" +
            " in the menu of VOCALOID5 to reset them.",
        ja = "全てのノートの発音記号が\"a\"に設定されました。" +
            "VOCALOID5のメニューから「ジョブ」->「発音記号を言語に合わせて変換」機能で発音記号をリセットしてください。",
        zhCN = "所有音符的音素都被设为了\"a\"。请使用VOCALOID5菜单中的「任务」->「发音符号匹配」功能来重置音素。",
        ru = "Фонемы всех нот были установлены на \"a\"." +
            " Пожалуйста, воспользуйтесь \"Job\" -> \"Convert Phonemes to Match Languages\"" +
            " в меню VOCALOID5 чтобы сбросить их.",
        fr = "Les phonèmes de toutes les notes ont été réglés sur \"a\". Veuillez utiliser \"Lyrics\" ->" +
            " \"Convert Phonemes to Match Languages\" dans le menu de VOCALOID5 pour les réinitialiser.",
        id = "Fonem semua nada disetel ke \"a\". Harap gunakan \"Job\" -> \"Convert Phonemes to Match Languages\"" +
            " di menu VOCALOID5 untuk meresetnya.",
    ),
    ExportNotificationTimeSignatureIgnored(
        en = "Could not convert time signatures to the target format.",
        ja = "拍子記号を出力することができませんでした。",
        zhCN = "未能将节拍记号导出到目标格式。",
        ru = "Не удалось преобразовать временные сигнатуры в целевой формат.",
        fr = "Impossible de convertir les signatures rythmiques au format cible.",
        id = "Tidak dapat mengonversi signatures waktu ke format target.",
    ),
    ExportNotificationPitchDataExported(
        en = "Some pitch parameters were exported. For a higher reproduction accuracy," +
            " you may need to turn off pitch transition and vibrato settings in the target editor.",
        ja = "ピッチパラメータが出力されました。出力側のエディターでピッチ推移やビブラートなどの設定を削除することで、より高い精度でピッチを" +
            "再現できる場合があります。",
        zhCN = "生成的文件中带有音高参数。您可能需要在对象编辑器中关闭音高平滑设置及颤音设置以达到更高的重现精度。",
        ru = "Некоторые параметры высоты тона были экспортированы. Для более высокой точности" +
            "воспроизведения, возможно вам потребуется отключить настройки высоты тона и" +
            " вибрато в целевом редакторе.",
        fr = "Certains paramètres de hauteur ont été exportés. Pour une plus grande précision," +
            " vous devrez peut-être désactiver les paramètres de transition de hauteur" +
            " et de vibrato dans l'éditeur cible.",
        id = "Beberapa parameter nada telah diekspor. Untuk akurasi reproduksi yang lebih tinggi," +
            " Anda mungkin perlu mematikan pengaturan transisi nada dan vibrato di editor target.",
    ),
    ExportNotificationDataOverLengthLimitIgnored(
        en = "Data exceeding length limit ignored. Please check if your output includes all your intended data.",
        ja = "一部のデータが長さ制限を超えているため、すべてのデータを出力することができませんでした。意図したデータが出力結果にすべて" +
            "入っているかどうかを確認してください。",
        zhCN = "部分数据超过了长度限制而被忽略，请检查生成的文件是否完整包含您所需要的数据。",
        ru = "Данные, превышающие предельную длину, игнорируются. Пожалуйста, проверьте," +
            " включает ли ваш вывод все предполагаемые данные.",
        fr = "Les données dépassant la limite de longueur sont ignorées." +
            " Veuillez vérifier que votre exportation inclut toutes les données prévues.",
        id = "Data yang melebihi batas panjang diabaikan. Harap periksa apakah keluaran Anda mencakup semua data yang Anda maksudkan.",
    ),
    SlightRestsFilling(
        en = "Fill short rests",
        ja = "短い休符を埋める",
        zhCN = "填充短休止符",
        ru = "Заполнить короткие промежутки",
        fr = "Remplir les courtes périodes de silence",
        id = "Isi kekosongan yang singkat",
    ),
    SlightRestsFillingDescription(
        en = "Extend note to fill the short rest between it and its next note",
        ja = "ノート同士の間に短い休符が挟まっている場合、前のノートを伸ばして隙間を埋めます",
        zhCN = "当音符之间存在较短的休止符时，将前一个音符延长来填充休止符",
        ru = "Расширить ноту, чтобы заполнить короткий промежуток между ней и следующей нотой",
        fr = "Prolonger la note pour combler le court silence qui la sépare de la note suivante.",
        id = "Perpanjang not untuk mengisi jeda singkat antara not tersebut dan not berikutnya",
    ),
    SlightRestsFillingThresholdLabel(
        en = "Max length to be processed (exclusive)",
        ja = "長さが入力値未満の場合処理",
        zhCN = "适用该处理的最大长度（不含）",
        ru = "Максимальная длина, подлежащая обработке (исключительная)",
        fr = "Longueur maximale à traiter (exclusive)",
        id = "Panjang maksimum yang akan diproses (eksklusif)",
    ),
    SlightRestsFillingThresholdItem(
        en = "1/{{denominator}} note",
        ja = "{{denominator}}分音符",
        zhCN = "{{denominator}}分音符",
        ru = "1/{{denominator}} ноты",
        fr = "1/{{denominator}} note",
        id = "1/{{denominator}} not",
    ),
    UseSimpleImport(
        en = "Simple Import",
        ja = "シンプルインポート",
        zhCN = "简单导入",
        ru = "Простой импорт",
        fr = "Importation simple",
        id = "Impor Sederhana",
    ),
    UseSimpleImportDescription(
        en = "Ignore detail parameters to accelerate importing",
        ja = "パラメータをインポートしないことで、より早くインポートする",
        zhCN = "忽略参数，使导入更快",
        ru = "Игнорировать подробные параметры для ускорения импорта",
        fr = "Ignorer les paramètres détaillés pour accélérer l'importation",
        id = "Abaikan parameter detail untuk mempercepat pengimporan",
    );

    fun get(language: Language): String = when (language) {
        English -> en
        French -> fr
        Japanese -> ja
        SimplifiedChinese -> zhCN
        Russian -> ru
        Indonesian -> id
    }
}

fun string(key: Strings, vararg params: Pair<String, String>): String {
    val options = object {}.asDynamic()
    params.forEach { (key, value) ->
        options[key] = value
    }
    return i18next.t(key.name, options) as String
}
