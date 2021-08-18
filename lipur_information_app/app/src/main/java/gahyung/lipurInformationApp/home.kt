package gahyung.lipurInformationApp

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_home.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.view.*
//import kotlinx.android.synthetic.main.activity_vodka.*
import java.util.*


class home : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.activity_home,container,false)
        view.layout_wisky.visibility = View.GONE

        //보드카 관련코드
        view?.vodka_btn?.setOnClickListener {
            activity?.finish() //현재 액티비티 종료

        }


        //보드카 관련코드
        //위스키 관련 코드
        view?.btn_wisky?.setOnClickListener {//위스키 버튼 누르면 위스키 목록사진이 보임
            view.first_layout.visibility = View.GONE
            view.layout_wisky.visibility = View.VISIBLE
        }
        view?.btn_wiskyBack?.setOnClickListener {//back 버튼 누르면 처음 레이아웃이 보임
            view.first_layout.visibility = View.VISIBLE
            view.layout_wisky.visibility = View.GONE

        }
        view?.btn_loyal_salute_21?.setOnClickListener {
            activity?.finish()
            startActivity(Intent(activity,loyal_salute_21_information::class.java))
        }




//위스키 관련 코드

    return view

    }



}