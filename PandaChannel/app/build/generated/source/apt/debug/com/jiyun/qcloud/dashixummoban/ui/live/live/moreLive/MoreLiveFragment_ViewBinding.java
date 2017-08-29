// Generated code from Butter Knife. Do not modify!
package com.jiyun.qcloud.dashixummoban.ui.live.live.moreLive;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jiyun.qcloud.dashixummoban.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MoreLiveFragment_ViewBinding<T extends MoreLiveFragment> implements Unbinder {
  protected T target;

  @UiThread
  public MoreLiveFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.gridview = Utils.findRequiredViewAsType(source, R.id.gridview, "field 'gridview'", GridView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.gridview = null;

    this.target = null;
  }
}
