// Generated code from Butter Knife. Do not modify!
package com.jiyun.qcloud.dashixummoban.ui.home;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jiyun.qcloud.dashixummoban.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomePageFragment_ViewBinding<T extends HomePageFragment> implements Unbinder {
  protected T target;

  @UiThread
  public HomePageFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.rvHome = Utils.findRequiredViewAsType(source, R.id.rv_home, "field 'rvHome'", RecyclerView.class);
    target.sflHome = Utils.findRequiredViewAsType(source, R.id.sfl_home, "field 'sflHome'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.rvHome = null;
    target.sflHome = null;

    this.target = null;
  }
}
