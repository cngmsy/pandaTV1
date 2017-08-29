// Generated code from Butter Knife. Do not modify!
package com.jiyun.qcloud.dashixummoban.ui.live.roll;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jiyun.qcloud.dashixummoban.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Live_RollFragment_ViewBinding<T extends Live_RollFragment> implements Unbinder {
  protected T target;

  @UiThread
  public Live_RollFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.listview = Utils.findRequiredViewAsType(source, R.id.listview, "field 'listview'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.listview = null;

    this.target = null;
  }
}
