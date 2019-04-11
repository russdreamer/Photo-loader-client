package com.toolittlespot.survey

const val REQUEST_WRITE_STORAGE = 112
const val END_RESULT_FILE: String = ",999\n"
const val SURVEY_WILL_BE_LOST: String = "Текущий опрос не будет сохранён. Вы уверены, что хотите выйти?"
const val SURVEY_REFRESH: String = "Вы уверены, что хотите сбросить текущий опрос?"
const val INCOMPLETE_SURVEY: String = "У вас остался незавершённый опрос. Хотите его завершить?"
const val DELETE_SURVEY_AND_RESULT: String = "Вы уверены, что хотите удалить опрос и его результаты?"
const val PERMISSION_ACCEPT: String = "Спасибо! Приложение сможет сохранять результат опросов на устройство."
const val SURVEY_EXISTS: String = "Опрос с таким же именем уже существует. Файл нового опроса заменит старый. Вы уверены?"
const val BLOCK_NOT_FOUND: String = "Не найден корректный блок вопроса, проверьте, что символ ## проставлены в начале " +
        "и конце блока. А также, что двойной символ ## написан без пробелов."
const val CORRECT_ANSWERS: String = "Заполните верно следующие блоки вопросов: "
const val SURVEY_STATE: String = "survey"
const val SAVED_PREFERENCES: String = "saved_state"
const val APP_FOLDER: String = "survey_app"
const val SURVEY_FOLDER: String = "surveys"
const val RESULT_FOLDER: String = "results"
const val APPLICATION_VERSION: String = "1.2"
const val AUTHOR_GIT: String = "https://github.com/russdreamer"
const val AUTHOR_MAIL: String = "russdreamer@gmail.com"
const val CREATE_INFO: String = "Как создать опрос?"
const val TEST_SURVEY: String = "Пример опроса"
const val KEYBOARD_INPUT_INFO: String = "В приложении предусмотрена возможность быстрого ответа с клавиатры. Если вы " +
        "используете приложение в эмуляторе на компьютере, то в окне опроса, вместо того, чтобы нажимать чекбоксы мышкой, можно вводить" +
        " последовательно трёхзначные номера ответов, и они будут автоматически отмечаться. Комбинация '999' означает " +
        "нажатие кнопки завершения. Для удобства вы будете видеть всплывающие окна с набранными ответами."
const val TEST_SURVEY_TEXT = "++ Опрос населения города Москвы.\n" +
        "Число опрашиваемых от 100 до 500 человек. ++ \n\n" +
        " ##\n 1. Ваш пол? \n" +
        "::1,1::\n" +
        "001 - мужской\n" +
        "002 - женский\n" +
        "##\n\n" +
        "##\n 2. Округ места проживания?\n" +
        "::0,2::\n" +
        "000 - Адрес фактического проживания\n" +
        "005 - Центральный округ\n" +
        "006 - Южный округ\n" +
        "007 - Северный округ\n" +
        "008 - Западный\n" +
        "009 - другой\n" +
        "000 - Адрес регистрации\n" +
        "010 - Центральный округ\n" +
        "011 - Южный округ\n" +
        "012 - Северный округ\n" +
        "013 - Западный\n" +
        "014 - другой\n" +
        "!! Более детально этот вопрос будет рассмотрен ниже !!" +
        "\n##"
const val HOW_CREATE_SURVEY: String = "Файл должен именоваться «НАЗВАНИЕ_ОПРОСА.txt». Название файла будет отображено" +
        " в списке опросов. Если вы создаёте файл внутри контструтора приложения, то расширение \".txt\" указывать" +
        " не нужно. Внутри файла действует следующая разметка строго в данной последовательности:\n" +
        "\n" +
        "++ ЗАГОЛОВОК ++ \n" +
        "Здесь может быть название опроса или любая другая полезная информация, которая будет отображена единожды перед" +
        " всеми вопросами. Это необязательный атрибут, он может отсутствовать вовсе. И не должен быть указан более одного" +
        " раза и только в самом начале файла.\n" +
        "\n" +
        " ## БЛОК ВОПРОСА ##\n" +
        "Таких блоков должно быть столько, сколько вопросов в анкете. Внутри этого блока располагаются: номер вопроса, " +
        "формулировка вопроса, минимальное и максимальное число ответов, заголовки ответов, варианты ответов и комментарий.\n" +
        "\n" +
        "Вопрос может начинаться сразу после знаков ##, либо со следующей строки. Наличие номера вопроса не обязательно. " +
        "Формулировка вопроса заканчивается там, где начинаются строка с минимальными и максимальными значениями (см. далее).\n" +
        "\n" +
        "::0,10::\n" +
        "Минимальное и максимальное количество обязательных ответов. Обязательный атрибут.\n" +
        "\n" +
        "105 -\n" +
        "Вариант ответа, где 105 - реальный номер вопроса после которого следует дефис (пробелы опциональны), " +
        "а затем сам вариант ответа. Может быть в интервале от 001 до 998 включительно. " +
        "Каждый вопрос пишется с новой строки, в одну строку. Обязательный атрибут. " +
        "Неограниченное количество на блок вопроса.\n" +
        "\n" +
        "000 -\n" +
        "Используйте данную комбинацию для добавления подзаголовка в тело вопроса, выделенного полужирным шрифтом. " +
        "Все подзаголовки размечаются одинаково \"000 -\", не зависимо от их количества. Необязательный атрибут. " +
        "Неограниченное количество на блок вопроса.\n" +
        "\n" +
        "!! КОММЕНТАРИЙ !!\n" +
        "Любая дополнительная информация под вопросом. Необязательный атрибут. Не более одного на каждый вопрос.\n" +
        "\n" +
        "Пример опросника:\n" +
        "\n $TEST_SURVEY_TEXT"