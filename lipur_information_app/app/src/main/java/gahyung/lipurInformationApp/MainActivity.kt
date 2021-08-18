package gahyung.lipurInformationApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.fixedRateTimer

var go : Boolean = true
class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var homeFragment = home()
        var accountFragment = account()
        when(item.itemId){
            R.id.home ->{
                if(supportFragmentManager.findFragmentByTag("home") != null){
                //supportFragmentManager.beginTransaction().replace(R.id.main_content,homeFragment,"home").commit()
                supportFragmentManager.beginTransaction().show(supportFragmentManager.findFragmentByTag("home")!!).commit()
                }
                else{
                    supportFragmentManager.beginTransaction().add(R.id.main_content, homeFragment,"home").commit()
                }
                if(supportFragmentManager.findFragmentByTag("account")!=null){
                    supportFragmentManager.beginTransaction().hide(supportFragmentManager.findFragmentByTag("account")!!).commit()
                }

                return true
            }
            R.id.account ->{

                //supportFragmentManager.beginTransaction().replace(R.id.main_content, accountFragment,"account").commit()
                if(supportFragmentManager.findFragmentByTag("account") != null){
                    supportFragmentManager.beginTransaction().show(supportFragmentManager.findFragmentByTag("account")!!).commit()
                }
                else{
                    supportFragmentManager.beginTransaction().add(R.id.main_content, accountFragment,"account").commit()
                }
                if(supportFragmentManager.findFragmentByTag("home")!=null){
                    supportFragmentManager.beginTransaction().hide(supportFragmentManager.findFragmentByTag("home")!!).commit()
                }

                return true
            }

        }
        return false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationview.setOnNavigationItemSelectedListener(this)//자기의 인터페이스 설정

         navigationview.selectedItemId = R.id.home//맨처음 선택되는 것이 home프래그먼트이다


    }
}