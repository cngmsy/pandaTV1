// Generated code from Butter Knife. Do not modify!
package com.jiyun.qcloud.dashixummoban.ui.live.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jiyun.qcloud.dashixummoban.R;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VideoActivity_ViewBinding<T extends VideoActivity> implements Unbinder {
  protected T target;

  @UiThread
  public VideoActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mJcplayer = Utils.findRequiredViewAsType(source, R.id.jcplayer, "field 'mJcplayer'", JCVideoPlayer.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mJcplayer = null;

    this.target = null;
  }
}
