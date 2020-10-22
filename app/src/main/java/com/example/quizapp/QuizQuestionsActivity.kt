package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

         mQuestionsList = Constants.getQuestions()




        // plats på frågorna minus 1 pga index börjar på 0
    }
    private fun setQuestions (){
        mCurrentPosition = 1
        val question= mQuestionsList!![mCurrentPosition-1]

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_opt_one.text = question.optOne
        tv_opt_two.text = question.optTwo
        tv_opt_three.text = question.optThree

    }
}