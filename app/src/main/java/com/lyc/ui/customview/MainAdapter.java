package com.lyc.ui.customview;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.lyc.ui.customview.bean.TypeBean;

import java.util.List;

public class MainAdapter extends BaseQuickAdapter<TypeBean, BaseViewHolder> {
    public MainAdapter(List<TypeBean> data) {
        super(R.layout.adapter_item_main, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TypeBean item) {
        helper.setText(R.id.title_tv, item.getTitle());
    }
}
