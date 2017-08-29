// Generated code from Butter Knife. Do not modify!
package com.jiyun.qcloud.dashixummoban.ui.live;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jiyun.qcloud.dashixummoban.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LivePageFragment_ViewBinding<T extends LivePageFragment> implements Unbinder {
  protected T target;

  @UiThread
  public LivePageFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.live_Tab = Utils.findRequiredViewAsType(source, R.id.live_tab, "field 'live_Tab'", TabLayout.class);
    target.live_Vip = Utils.findRequiredViewAsType(source, R.id.live_vip, "field 'live_Vip'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.live_Tab = null;
    target.live_Vip = null;

    this.target = null;
  }
}
