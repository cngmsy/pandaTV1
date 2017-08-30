// Generated code from Butter Knife. Do not modify!
package com.jiyun.qcloud.dashixummoban.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.jiyun.qcloud.dashixummoban.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  private View view2131558599;

  private View view2131558600;

  private View view2131558601;

  private View view2131558602;

  private View view2131558603;

  @UiThread
  public MainActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.iconImg = Utils.findRequiredViewAsType(source, R.id.iconImg, "field 'iconImg'", ImageView.class);
    target.personImg = Utils.findRequiredViewAsType(source, R.id.personImg, "field 'personImg'", ImageView.class);
    target.titleTv = Utils.findRequiredViewAsType(source, R.id.titleTv, "field 'titleTv'", TextView.class);
    target.hudongImg = Utils.findRequiredViewAsType(source, R.id.hudongImg, "field 'hudongImg'", ImageView.class);
    target.container = Utils.findRequiredViewAsType(source, R.id.container, "field 'container'", FrameLayout.class);
    view = Utils.findRequiredView(source, R.id.homePage, "field 'homePage' and method 'onClicks'");
    target.homePage = Utils.castView(view, R.id.homePage, "field 'homePage'", RadioButton.class);
    view2131558599 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClicks(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.homePandaLive, "field 'homePandaLive' and method 'onClicks'");
    target.homePandaLive = Utils.castView(view, R.id.homePandaLive, "field 'homePandaLive'", RadioButton.class);
    view2131558600 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClicks(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.homeRollVideo, "field 'homeRollVideo' and method 'onClicks'");
    target.homeRollVideo = Utils.castView(view, R.id.homeRollVideo, "field 'homeRollVideo'", RadioButton.class);
    view2131558601 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClicks(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.homePandaBroadcast, "field 'homePandaBroadcast' and method 'onClicks'");
    target.homePandaBroadcast = Utils.castView(view, R.id.homePandaBroadcast, "field 'homePandaBroadcast'", RadioButton.class);
    view2131558602 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClicks(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.homeLiveChina, "field 'homeLiveChina' and method 'onClicks'");
    target.homeLiveChina = Utils.castView(view, R.id.homeLiveChina, "field 'homeLiveChina'", RadioButton.class);
    view2131558603 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClicks(p0);
      }
    });
    target.homeBottomGroup = Utils.findRequiredViewAsType(source, R.id.homeBottomGroup, "field 'homeBottomGroup'", RadioGroup.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.iconImg = null;
    target.personImg = null;
    target.titleTv = null;
    target.hudongImg = null;
    target.container = null;
    target.homePage = null;
    target.homePandaLive = null;
    target.homeRollVideo = null;
    target.homePandaBroadcast = null;
    target.homeLiveChina = null;
    target.homeBottomGroup = null;

    view2131558599.setOnClickListener(null);
    view2131558599 = null;
    view2131558600.setOnClickListener(null);
    view2131558600 = null;
    view2131558601.setOnClickListener(null);
    view2131558601 = null;
    view2131558602.setOnClickListener(null);
    view2131558602 = null;
    view2131558603.setOnClickListener(null);
    view2131558603 = null;

    this.target = null;
  }
}
