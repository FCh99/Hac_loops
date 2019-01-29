package udemy.fausto.com.temp3


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.Collections.addAll
import kotlin.math.pow

// https://www.hackerrank.com/challenges/java-loops/problem


class MainActivity : AppCompatActivity() {


    var input = arrayOf<Array<Int>>(
        arrayOf(0, 2, 10),   // a, b, n
        arrayOf(5, 3, 5)

    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("----------->")

        val miResult = getQueryLine(input[0])
        println(miResult)

        val mi2Result = getQueryLine(input[1])
        println(mi2Result)




    }

    fun getQueryLine(inArray: Array<Int>): ArrayList<Int>  {

        var salidaArrayList = arrayListOf<Int>()
        var a = inArray[0]
        val b = inArray[1]
        val n = inArray[2]
        var s = 0

        for (i in 0..n-1) {
            if (i == 0) {
                a = inArray[0]
            } else {
                a = 0
            }

            var r = 2.0.pow(i).toInt() * b
            s += a + r
            salidaArrayList.add(s)

        }


        return salidaArrayList
    }


    }


