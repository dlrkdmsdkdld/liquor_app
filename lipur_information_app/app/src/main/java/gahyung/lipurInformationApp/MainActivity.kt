package gahyung.lipurInformationApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home ->{
                var homeFragment = home()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,homeFragment).commit()
                return true
            }
            R.id.account ->{
                var accountFragment = account()

                supportFragmentManager.beginTransaction().replace(R.id.main_content,accountFragment).commit()

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