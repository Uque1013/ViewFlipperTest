package kr.hs.emirim.kye.viewflippertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnPrev = findViewById<Button>(R.id.btnPrevious)
        var btnNext = findViewById<Button>(R.id.btnNext)
        var flipper = findViewById<ViewFlipper>(R.id.flipper1)

        btnPrev.setOnClickListener {
            flipper.showPrevious()
        }

        btnNext.setOnClickListener {
            flipper.showNext()
        }

    }
}