package asia.aaii.gcselanpya

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.ScrollView

class MainActivity : Activity() {
    private val navy = Color.rgb(20, 31, 66)
    private val blue = Color.rgb(69, 104, 220)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = navy
        window.navigationBarColor = navy
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.rgb(246, 248, 253))
            setPadding(22, 28, 22, 24)
        }
        root.addView(TextView(this).apply {
            text = "GCSE LanPya"
            textSize = 28f; setTextColor(Color.WHITE); gravity = Gravity.CENTER_VERTICAL
            setPadding(20, 24, 20, 24); setBackgroundColor(navy)
        })
        root.addView(TextView(this).apply {
            text = "Learn with confidence · သေချာလေ့လာ၊ ယုံကြည်မှုရှိစွာ ဖြေဆို"
            textSize = 15f; setTextColor(navy); setPadding(4, 22, 4, 18)
        })
        root.addView(card("Choose your exam board", "Cambridge IGCSE  ·  Oxford AQA  ·  Pearson Edexcel"))
        root.addView(card("Learning", "Subject lessons, key concepts and revision notes"))
        root.addView(card("Practice", "Multiple-choice and structured-question practice"))
        root.addView(card("Exam preparation", "Past-paper practice and timed revision"))
        root.addView(TextView(this).apply {
            text = "V2.9 Native foundation build\nLearning content is a starter shell; the complete verified syllabus and question bank have not yet been bundled."
            textSize = 12f; setTextColor(Color.DKGRAY); setPadding(8, 22, 8, 8)
        })
        setContentView(ScrollView(this).apply { addView(root) })
    }
    private fun card(title: String, detail: String) = LinearLayout(this).apply {
        orientation = LinearLayout.VERTICAL
        setPadding(18, 18, 18, 18)
        setBackgroundColor(Color.WHITE)
        val h = TextView(this@MainActivity).apply {
            text = title; textSize = 18f; setTextColor(blue)
        }
        val d = TextView(this@MainActivity).apply {
            text = detail; textSize = 14f; setTextColor(navy); setPadding(0, 8, 0, 0)
        }
        addView(h); addView(d)
        val p = LinearLayout.LayoutParams(-1, -2); p.bottomMargin = 14
        layoutParams = p
    }
}
