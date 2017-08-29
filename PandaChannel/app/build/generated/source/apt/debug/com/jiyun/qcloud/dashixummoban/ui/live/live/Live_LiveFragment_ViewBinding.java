// Generated code from Butter Knife. Do not modify!
package com.jiyun.qcloud.dashixummoban.ui.live.live;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.jiyun.qcloud.dashixummoban.R;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Live_LiveFragment_ViewBinding<T extends Live_LiveFragment> implements Unbinder {
  protected T target;

  private View view2131558522;

  @UiThread
  public Live_LiveFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.title = Utils.findRequiredViewAsType(source, R.id.tit, "field 'title'", TextView.class);
    view = Utils.findRequiredView(source, R.id.image, "field 'image' and method 'onViewClicked'");
    target.image = Utils.castView(view, R.id.image, "field 'image'", ImageView.class);
    view2131558522 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.context = Utils.findRequiredViewAsType(source, R.id.context, "field 'context'", TextView.class);
    target.mTablayout = Utils.findRequiredViewAsType(source, R.id.tablayout, "field 'mTablayout'", TabLayout.class);
    target.mViewpager = Utils.findRequiredViewAsType(source, R.id.viewpager, "field 'mViewpager'", ViewPager.class);
    target.jcVideoPlayer = Utils.findRequiredViewAsType(source, R.id.jiecao, "field 'jcVideoPlayer'", JCVideoPlayer.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.title = null;
    target.image = null;
    target.context = null;
    target.mTablayout = null;
    target.mViewpager = null;
    target.jcVideoPlayer = null;

    view2131558522.setOnClickListener(null);
    view2131558522 = null;

    this.target = null;
  }
}
