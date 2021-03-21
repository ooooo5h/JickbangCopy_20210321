package com.neppplus.jickbangcopy_20210321.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.jickbangcopy_20210321.datas.Room

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {
}