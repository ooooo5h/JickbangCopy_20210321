package com.neppplus.jickbangcopy_20210321

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210321.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20210321.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<Room>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRooms.add( Room(7500, "서울시 동대문구", 2, "동대문구 2층 방입니다."))
        mRooms.add( Room(17500, "서울시 서대문구", 4, "서대문구 4층 방입니다."))
        mRooms.add( Room(25000, "서울시 동대문구", 0, "동대문구 0층 방입니다."))
        mRooms.add( Room(3400, "서울시 중랑구", 2, "중랑구 2층 방입니다."))
        mRooms.add( Room(156000, "서울시 동대문구", -3, "동대문구 -3층 방입니다."))
        mRooms.add( Room(7500, "서울시 중구", 0, "중구 0층 방입니다."))
        mRooms.add( Room(6500, "서울시 서대문구", 2, "서대문구 2층 방입니다."))
        mRooms.add( Room(4000, "서울시 중구", -2, "중구 -2층 방입니다."))
        mRooms.add( Room(2300, "서울시 서대문구", 15, "서대문구 15층 방입니다."))
        mRooms.add( Room(680000, "서울시 중구", -2, "중구 -2층 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRooms)

        roomListView.adapter = mRoomAdapter

    }
}