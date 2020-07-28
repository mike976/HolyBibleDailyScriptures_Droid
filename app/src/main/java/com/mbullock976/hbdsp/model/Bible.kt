package com.mbullock976.hbdsp.model

class Bible() {


    var books: Array<Book>
    var psalms: MutableMap<Int, Int>
    var proverbs: MutableMap<Int, Int>

    init {

        val matthew = Book(NewTestament.Matthew, mutableMapOf(
                1 to 25,
                2 to 18,
                3 to 17,
                4 to 25,
                5 to 48,
                6 to 34,
                7 to 29,
                8 to 34,
                9 to 38,
                10 to 42,
                11 to 30,
                12 to 50,
                13 to 58,
                14 to 36,
                15 to 39,
                16 to 28,
                17 to 27,
                18 to 35,
                19 to 30,
                20 to 33,
                21 to 46,
                22 to 46,
                23 to 39,
                24 to 51,
                25 to 46,
                26 to 75,
                27 to 66,
                28 to 20
            )
        )

        val mark = Book(NewTestament.Mark, mutableMapOf(
            1 to 45,
            2 to 28,
            3 to 35,
            4 to 41,
            5 to 43,
            6 to 56,
            7 to 37,
            8 to 38,
            9 to 50,
            10 to 52,
            11 to 33,
            12 to 44,
            13 to 37,
            14 to 72,
            15 to 47,
            16 to 20
        ))

        val luke = Book(NewTestament.Luke, mutableMapOf(
            1 to  80,
            2 to  52,
            3 to  38,
            4 to  44,
            5 to  39,
            6 to  49,
            7 to  50,
            8 to  56,
            9 to  62,
            10 to  42,
            11 to  54,
            12 to  59,
            13 to  35,
            14 to  35,
            15 to  32,
            16 to  31,
            17 to  37,
            18 to  43,
            19 to  48,
            20 to  47,
            21 to  38,
            22 to  71,
            23 to  56,
            24 to  53

        ))

        val john = Book(NewTestament.John, mutableMapOf(
         1 to 51,
         2 to 25,
         3 to 36,
         4 to 54,
         5 to 47,
         6 to 71,
         7 to 53,
         8 to 59,
         9 to 41,
         10 to 42,
         11 to 57,
         12 to 50,
         13 to 38,
         14 to 31,
         15 to 27,
         16 to 33,
         17 to 26,
         18 to 40,
         19 to 42,
         20 to 31,
         21 to 25

        ))

        val acts = Book(NewTestament.Acts, mutableMapOf(
        1 to 26,
        2 to 47,
        3 to 26,
        4 to 37,
        5 to 42,
        6 to 15,
        7 to 60,
        8 to 40,
        9 to 43,
        10 to 48,
        11 to 30,
        12 to 25,
        13 to 52,
        14 to 28,
        15 to 41,
        16 to 40,
        17 to 34,
        18 to 28,
        19 to 41,
        20 to 38,
        21 to 40,
        22 to 30,
        23 to 35,
        24 to 27,
        25 to 27,
        26 to 32,
        27 to 44,
        28 to 31

        ))

        val romans = Book(NewTestament.Romans, mutableMapOf(
            1 to 32,
            2 to 29,
            3 to 31,
            4 to 25,
            5 to 21,
            6 to 23,
            7 to 25,
            8 to 39,
            9 to 33,
            10 to 21,
            11 to 36,
            12 to 21,
            13 to 14,
            14 to 23,
            15 to 33,
            16 to 27

        ))

        val corinthians1 = Book(NewTestament.Corinthians_1, mutableMapOf(
            1 to 31,
            2 to 16,
            3 to 23,
            4 to 21,
            5 to 13,
            6 to 20,
            7 to 40,
            8 to 13,
            9 to 27,
            10 to 33,
            11 to 34,
            12 to 31,
            13 to 13,
            14 to 40,
            15 to 58,
            16 to 24

        ))

        val corinthians2 = Book(NewTestament.Corinthians_2, mutableMapOf(
            1 to 24,
            2 to 17,
            3 to 18,
            4 to 18,
            5 to 21,
            6 to 18,
            7 to 16,
            8 to 24,
            9 to 15,
            10 to 18,
            11 to 33,
            12 to 21,
            13 to 14

        ))

        val galatians = Book(NewTestament.Galatians, mutableMapOf(
            1 to 24,
            2 to 21,
            3 to 29,
            4 to 31,
            5 to 26,
            6 to 18

        ))

        val ephesians = Book(NewTestament.Ephesians, mutableMapOf(
            1 to 23,
            2 to 22,
            3 to 21,
            4 to 32,
            5 to 33,
            6 to 24
        ))

        val phillipians = Book(NewTestament.Phillipians, mutableMapOf(
            1 to 30,
            2 to 30,
            3 to 21,
            4 to 23

        ))

        val colossians = Book(NewTestament.Colossians, mutableMapOf(
            1 to 29,
            2 to 23,
            3 to 25,
            4 to 18

        ))

        val thessalonians1 = Book(NewTestament.Thessalonians_1, mutableMapOf(
            1 to 10,
            2 to 20,
            3 to 13,
            4 to 18,
            5 to 28

        ))

        val thessalonians2 = Book(NewTestament.Thessalonians_2, mutableMapOf(
            1 to 12,
            2 to 17,
            3 to 18

        ))

        val timothy1 = Book(NewTestament.Timothy_1, mutableMapOf(
            1 to 20,
            2 to 15,
            3 to 16,
            4 to 16,
            5 to 25,
            6 to 21

        ))

        val timothy2 = Book(NewTestament.Timothy_2, mutableMapOf(
            1 to 18,
            2 to 26,
            3 to 17,
            4 to 22

        ))

        val titus = Book(NewTestament.Titus, mutableMapOf(
            1 to 16,
            2 to 15,
            3 to 15
        ))

        val philemon = Book(NewTestament.Philemon, mutableMapOf(
            1 to 25
        ))

        val hebrews = Book(NewTestament.Hebrews, mutableMapOf(
            1 to 14,
            2 to 18,
            3 to 19,
            4 to 16,
            5 to 14,
            6 to 20,
            7 to 28,
            8 to 13,
            9 to 28,
            10 to 39,
            11 to 40,
            12 to 29,
            13 to 25
        ))

        val james = Book(NewTestament.James, mutableMapOf(
            1 to 27,
            2 to 26,
            3 to 18,
            4 to 17,
            5 to 20
        ))

        val peter1 = Book(NewTestament.Peter_1, mutableMapOf(
            1 to 25,
            2 to 25,
            3 to 22,
            4 to 19,
            5 to 14
        ))


        val peter2 = Book(NewTestament.Peter_2, mutableMapOf(
            1 to 21,
            2 to 22,
            3 to 18
        ))

        val john1 = Book(NewTestament.John_1, mutableMapOf(
            1 to 10,
            2 to 29,
            3 to 24,
            4 to 21,
            5 to 21
        ))

        val john2 = Book(NewTestament.John_2, mutableMapOf(
            1 to 13
        ))

        val john3 = Book(NewTestament.John_3, mutableMapOf(
            1 to 14
        ))

        val jude = Book(NewTestament.Jude, mutableMapOf(
            1 to 25
        ))

        val revelation = Book(NewTestament.Revelation, mutableMapOf(
            1 to 20,
            2 to 29,
            3 to 22,
            4 to 11,
            5 to 14,
            6 to 17,
            7 to 17,
            8 to 13,
            9 to 21,
            10 to 11,
            11 to 19,
            12 to 18,
            13 to 18,
            14 to 20,
            15 to 8,
            16 to 21,
            17 to 18,
            18 to 24,
            19 to 21,
            20 to 15,
            21 to 27,
            22 to 21
        ))

        this.books = arrayOf(matthew, mark, luke, john, acts, romans, corinthians1, corinthians2, galatians,
            ephesians, phillipians, colossians, thessalonians1, thessalonians2, timothy1, timothy2, titus, philemon,
            hebrews, james, peter1, peter2, john1, john2, john3, jude, revelation)

        this.psalms = mutableMapOf(

            1 to 6,
            2 to 12,
            3 to 8,
            4 to 8,
            5 to 12,
            6 to 10,
            7 to 17,
            8 to 9,
            9 to 20,
            10 to 18,
            11 to 7,
            12 to 8,
            13 to 6,
            14 to 7,
            15 to 5,
            16 to 11,
            17 to 15,
            18 to 50,
            19 to 14,
            20 to 9,

            21 to 13,
            22 to 31,
            23 to 6,
            24 to 10,
            25 to 22,
            26 to 12,
            27 to 14,
            28 to 9,
            29 to 11,
            30 to 12,

            31 to 24,
            32 to 11,
            33 to 22,
            34 to 22,
            35 to 28,
            36 to 12,
            37 to 40,
            38 to 22,
            39 to 13,
            40 to 17,

            41 to 13,
            42 to 11,
            43 to 5,
            44 to 26,
            45 to 17,
            46 to 11,
            47 to 9,
            48 to 14,
            49 to 20,
            50 to 23,

            51 to 19,
            52 to 9,
            53 to 6,
            54 to 7,
            55 to 23,
            56 to 13,
            57 to 11,
            58 to 11,
            59 to 17,
            60 to 12,
            61 to 8,
            62 to 12,
            63 to 11,
            64 to 10,
            65 to 13,
            66 to 20,
            67 to 7,
            68 to 35,
            69 to 36,
            70 to 5,

            71 to 24,
            72 to 20,
            73 to 28,
            74 to 23,
            75 to 10,
            76 to 12,
            77 to 20,
            78 to 72,
            79 to 13,
            80 to 19,
            81 to 16,
            82 to 8,
            83 to 18,
            84 to 12,
            85 to 13,
            86 to 17,
            87 to 7,
            88 to 18,
            89 to 52,
            90 to 17,

            91 to 16,
            92 to 15,
            93 to 5,
            94 to 23,
            95 to 11,
            96 to 13,
            97 to 12,
            98 to 9,
            99 to 9,
            100 to 5,
            101 to 8,
            102 to 28,
            103 to 22,
            104 to 35,
            105 to 45,
            106 to 48,
            107 to 43,
            108 to 13,
            109 to 31,
            110 to 7,

            111 to 10,
            112 to 10,
            113 to 9,
            114 to 8,
            115 to 18,
            116 to 19,
            117 to 2,
            118 to 29,
            119 to 176,
            120 to 7,
            121 to 8,
            122 to 9,
            123 to 4,
            124 to 8,
            125 to 5,
            126 to 6,
            127 to 5,
            128 to 6,
            129 to 8,
            130 to 8,

            131 to 3,
            132 to 18,
            133 to 3,
            134 to 3,
            135 to 21,
            136 to 26,
            137 to 9,
            138 to 8,
            139 to 24,
            140 to 13,
            141 to 10,
            142 to 7,
            143 to 12,
            144 to 15,
            145 to 21,
            146 to 10,
            147 to 20,
            148 to 14,
            149 to 9,
            150 to 6
        )

        this.proverbs = mutableMapOf(

            1 to 33,
            2 to 22,
            3 to 35,
            4 to 27,
            5 to 23,
            6 to 35,
            7 to 27,
            8 to 36,
            9 to 18,
            10 to 32,
            11 to 31,
            12 to 28,
            13 to 25,
            14 to 35,
            15 to 33,
            16 to 33,
            17 to 28,
            18 to 24,
            19 to 29,
            20 to 30,

            21 to 31,
            22 to 29,
            23 to 35,
            24 to 34,
            25 to 28,
            26 to 28,
            27 to 27,
            28 to 28,
            29 to 27,
            30 to 33,

            31 to 31


        )

    }

}