// Generated code from Butter Knife. Do not modify!
package com.jiyun.qcloud.dashixummoban.ui.live.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jiyun.qcloud.dashixummoban.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlayVideoActivity_ViewBinding<T extends PlayVideoActivity> implements Unbinder {
  protected T target;

  @UiThread
  public PlayVideoActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.line1 = Utils.findRequiredViewAsType(source, R.id.line1, "field 'line1'", LinearLayout.class);
    target.line2 = Utils.findRequiredViewAsType(source, R.id.line2, "field 'line2'", LinearLayout.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.tit, "field 'title'", TextView.class);
    target.video = Utils.findRequiredViewAsType(source, R.id.video, "field 'video'", VideoView.class);
    target.start = Utils.findRequiredViewAsType(source, R.id.start, "field 'start'", ImageView.class);
    target.start_seek = Utils.findRequiredViewAsType(source, R.id.start_seek, "field 'start_seek'", SeekBar.class);
    target.clarity = Utils.findRequiredViewAsType(source, R.id.clarity, "field 'clarity'", Button.class);
    target.sound = Utils.findRequiredViewAsType(source, R.id.sound, "field 'sound'", ImageView.class);
    target.sound_seek = Utils.findRequiredViewAsType(source, R.id.sound_seek, "field 'sound_seek'", SeekBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.line1 = null;
    target.line2 = null;
    target.back = null;
    target.title = null;
    target.video = null;
    target.start = null;
    target.start_seek = null;
    target.clarity = null;
    target.sound = null;
    target.sound_seek = null;

    this.target = null;
  }
}
