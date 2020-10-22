package com.example.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener{

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

         mQuestionsList = Constants.getQuestions()

        setQuestions()

        tv_opt_one.setOnClickListener(this)
        tv_opt_two.setOnClickListener(this)
        tv_opt_three.setOnClickListener(this)





        // plats på frågorna minus 1 pga index börjar på 0
    }
    private fun setQuestions (){
        mCurrentPosition = 1
        val question= mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_opt_one.text = question.optOne
        tv_opt_two.text = question.optTwo
        tv_opt_three.text = question.optThree

    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, tv_opt_one)
        options.add(1, tv_opt_two)
        options.add(2, tv_opt_three)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable( this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_opt_one -> {
                selectedOptionView(tv_opt_one,1)
            }
            R.id.tv_opt_two -> {
                selectedOptionView(tv_opt_two, 2)
            }
            R.id.tv_opt_three -> {
                selectedOptionView(tv_opt_three, 3)
            }

        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable( this, R.drawable.select_option_border_bg)
    }
}