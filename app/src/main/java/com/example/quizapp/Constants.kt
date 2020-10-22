package com.example.quizapp

object Constants {

    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions (): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question (
            1,
            "Who is this?",
             R.drawable.disney_jasmine,
            "Jamila", "Jasmine",
            "Janine", 2
        )

        questionsList.add(que1)

        val que2 = Question (
            2,
            "Who is this?",
            R.drawable.aurora2,
            "Anastasia", "Alice",
            "Aurora", 3
        )

        questionsList.add(que2)

        val que3 = Question (
            3,
            "Who is this?",
            R.drawable.belle2,
            "Belle", "Ella",
            "Ariel", 1
        )

        questionsList.add(que3)

        val que4 = Question (
            4,
            "Who is this?",
            R.drawable.mulan2,
            "Pocahontas", "Mulan",
            "Ling", 2
        )

        questionsList.add(que4)

        val que5 = Question (
            5,
            "Who is this?",
            R.drawable.tiana,
            "Arianna", "Alana",
            "Tiana", 3
        )

        questionsList.add(que5)


        return questionsList
    }
}