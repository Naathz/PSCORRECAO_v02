package com.example.logonrmlocal.pokedexapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    private fun carregar(){
        val anim = AnimationUtils.loadAnimation(this, R.anim.splash)
        anim.reset()

        ivLogo.startAnimation(anim)

        Handler().postDelayed({

            //passar para uma nova tela vc chama o startActivity e indica que a intenção é daqui para a Lista Activity
            startActivity(Intent(this, ListaPokemonActivity::class.java))

            //coloque o finish() para terminar a SplashScreen
            finish()
        },
                3000)
    //3000 é o tempo de duração até mudar de tela
    }
}
