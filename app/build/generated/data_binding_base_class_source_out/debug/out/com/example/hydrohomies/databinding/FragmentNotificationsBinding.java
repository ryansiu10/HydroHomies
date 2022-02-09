// Generated by view binder compiler. Do not edit!
package com.example.hydrohomies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.hydrohomies.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNotificationsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Spinner spinner;

  @NonNull
  public final Switch switch2;

  @NonNull
  public final TextView textNotifications;

  private FragmentNotificationsBinding(@NonNull ConstraintLayout rootView, @NonNull Spinner spinner,
      @NonNull Switch switch2, @NonNull TextView textNotifications) {
    this.rootView = rootView;
    this.spinner = spinner;
    this.switch2 = switch2;
    this.textNotifications = textNotifications;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_notifications, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNotificationsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.spinner;
      Spinner spinner = ViewBindings.findChildViewById(rootView, id);
      if (spinner == null) {
        break missingId;
      }

      id = R.id.switch2;
      Switch switch2 = ViewBindings.findChildViewById(rootView, id);
      if (switch2 == null) {
        break missingId;
      }

      id = R.id.text_notifications;
      TextView textNotifications = ViewBindings.findChildViewById(rootView, id);
      if (textNotifications == null) {
        break missingId;
      }

      return new FragmentNotificationsBinding((ConstraintLayout) rootView, spinner, switch2,
          textNotifications);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
