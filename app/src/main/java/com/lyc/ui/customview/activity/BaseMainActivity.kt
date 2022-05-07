package com.lyc.ui.customview.activity

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.lyc.ui.customview.MainAdapter
import com.lyc.ui.customview.R
import com.lyc.ui.customview.bean.TypeBean
import kotlinx.android.synthetic.main.activity_base_main.*
import java.util.*

class BaseMainActivity : AppCompatActivity(),  OnItemClickListener {

    // ？修饰申明在成员变量的类型后面，表示这个变量可以为null。
    // 该变量如果为null时，不会执行该变量后面的逻辑，也不会抛出空指针异常，俗称空安全。
    // 如果不为null，会正常执行该变量后面的内容。
    private var adapter: MainAdapter? = null

    // val声明的是只读变量，相当于java中的final
    private val typeBeans = ArrayList<TypeBean>()

    private val data: List<TypeBean>
        get() {
            typeBeans.add(TypeBean("气泡漂浮动画", 0))
            typeBeans.add(TypeBean("波浪动画--贝塞尔曲线实现", 1))
            typeBeans.add(TypeBean("波浪动画--正余弦函数实现", 2))
            typeBeans.add(TypeBean("水波（雷达）扩散效果", 3))
            typeBeans.add(TypeBean("RecyclerView实现另类的Tag标签", 4))
            typeBeans.add(TypeBean("按钮自定义动画", 5))
            typeBeans.add(TypeBean("自定义支付密码输入框", 6))
            typeBeans.add(TypeBean("自定义进度条", 7))
            typeBeans.add(TypeBean("使用的带动画的view", 8))
            typeBeans.add(TypeBean("粘性小球", 9))
            typeBeans.add(TypeBean("banner", 10))
            typeBeans.add(TypeBean("吸顶效果--一行代码实现", 11))
            typeBeans.add(TypeBean("揭露动画", 12))
            typeBeans.add(TypeBean("支付宝首页效果", 13))
            typeBeans.add(TypeBean("RecyclerView的item动画", 14))
            typeBeans.add(TypeBean("路径path动画", 15))
            typeBeans.add(TypeBean("仿新浪投票控件", 16))
            typeBeans.add(TypeBean("直播侧滑清屏效果", 17))
            return typeBeans;
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_main)

        adapter = MainAdapter(data)
        adapter!!.setOnItemClickListener(this)

        recycler_view.layoutManager =LinearLayoutManager(this);
        recycler_view.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        recycler_view.adapter = adapter
    }

    override fun onItemClick(adapter: BaseQuickAdapter<*, *>, view: View, position: Int) {
        TODO("Not yet implemented")
    }
}