// Generated code from Butter Knife. Do not modify!
package com.jiyun.qcloud.dashixummoban.ui.home;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.jiyun.qcloud.dashixummoban.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomePageFragment_ViewBinding<T extends HomePageFragment> implements Unbinder {
  protected T target;

  private View view2131558610;

  @UiThread
  public HomePageFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.homeBtns, "field 'homeBtns' and method 'onViewClicked'");
    target.homeBtns = Utils.castView(view, R.id.homeBtns, "field 'homeBtns'", Button.class);
    view2131558610 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.homeRecyclerView = Utils.findRequiredViewAsType(source, R.id.homeRecyclerView, "field 'homeRecyclerView'", XRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.homeBtns = null;
    target.homeRecyclerView = null;

    view2131558610.setOnClickListener(null);
    view2131558610 = null;

    this.target = null;
  }
}
