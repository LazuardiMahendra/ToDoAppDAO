// Generated by view binder compiler. Do not edit!
package com.example.todolistappdao.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todolistappdao.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewListTodoBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView ivDelete;

  @NonNull
  public final ImageView ivEdit;

  @NonNull
  public final TextView tvDesc;

  @NonNull
  public final TextView tvTitte;

  private ViewListTodoBinding(@NonNull MaterialCardView rootView, @NonNull ImageView ivDelete,
      @NonNull ImageView ivEdit, @NonNull TextView tvDesc, @NonNull TextView tvTitte) {
    this.rootView = rootView;
    this.ivDelete = ivDelete;
    this.ivEdit = ivEdit;
    this.tvDesc = tvDesc;
    this.tvTitte = tvTitte;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewListTodoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewListTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_list_todo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewListTodoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_delete;
      ImageView ivDelete = ViewBindings.findChildViewById(rootView, id);
      if (ivDelete == null) {
        break missingId;
      }

      id = R.id.iv_edit;
      ImageView ivEdit = ViewBindings.findChildViewById(rootView, id);
      if (ivEdit == null) {
        break missingId;
      }

      id = R.id.tv_desc;
      TextView tvDesc = ViewBindings.findChildViewById(rootView, id);
      if (tvDesc == null) {
        break missingId;
      }

      id = R.id.tv_titte;
      TextView tvTitte = ViewBindings.findChildViewById(rootView, id);
      if (tvTitte == null) {
        break missingId;
      }

      return new ViewListTodoBinding((MaterialCardView) rootView, ivDelete, ivEdit, tvDesc,
          tvTitte);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
