package com.lee.standardfuntions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lee.standardfuntions.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }



        testStandardFuntions()
    }

    /**
     * run, with, let, also, apply 테스트
     */
    private fun testStandardFuntions() {
        var firstPerson = Person("김철수", 34, "회사원")
        var secondPerson = Person("홍길동", 22, "미용사")

        var oldPerson = if (firstPerson.age > secondPerson.age) firstPerson else secondPerson
        oldPerson.printPersion()


        run {
            if (firstPerson.age > secondPerson.age) firstPerson else secondPerson
        }.printPersion()

        with(firstPerson) {
            age += 2
            "Age is $age"
        }.println()

        firstPerson.run {
            age += 1
            "Age is $age"
        }.println()

        firstPerson.let {
            it.age += 1
            "Age is ${it.age}"
        }.println()

        firstPerson.also {
            it.age += 1
            it.name = "김영수"
        }.printPersion()

        firstPerson.apply {
            age += 1
            job = "프로그래머"
        }.printPersion()

    }

}
