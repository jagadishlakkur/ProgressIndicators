package com.jagadish.progressindicators2;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class ProgressBars {

    Context context;
    static  ProgressDialog progressDialog;
    static Dialog dialog;
    static  Dialog anim_dialog;
    static Dialog bubble_dialog;

    public static void displayProgressDailog(Context context)
    {

        progressDialog=new ProgressDialog(context);
        progressDialog.setMessage("Loading..");
        progressDialog.show();

    }

    public static void displayProgressDailog(Context context,String message)
    {

        progressDialog=new ProgressDialog(context);
        progressDialog.setMessage(message);
        progressDialog.show();

    }

    public static void displayProgressDailog(Context context,String message,boolean cancelable)
    {

        progressDialog=new ProgressDialog(context);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(cancelable);
        progressDialog.show();

    }

    public static void dismissProgressDailog()
    {

        progressDialog.dismiss();

    }


    public static void displayCustomProgress(Context context)
    {

        dialog = new Dialog(context, android.R.style.Theme_Black);
        View view2 = LayoutInflater.from(context).inflate(R.layout.background, null);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawableResource(R.color.transparent2);
        dialog.setContentView(view2);
        dialog.show();

    }

    public static void dismissCustomProgress()
    {

        dialog.dismiss();

    }


    public static void displayAnimDailog(Context context)
    {

        anim_dialog = new Dialog(context, android.R.style.Theme_Black);
        View view2 = LayoutInflater.from(context).inflate(R.layout.anim_progressbar, null);
        anim_dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        anim_dialog.getWindow().setBackgroundDrawableResource(R.color.transparent2);
        anim_dialog.setContentView(view2);
        anim_dialog.show();

    }

    public static void dismissAnimDailog()
    {

        anim_dialog.dismiss();

    }


    public static void displayBubbleDailog(Context context)
    {

        bubble_dialog = new Dialog(context, android.R.style.Theme_Black);
        View view2 = LayoutInflater.from(context).inflate(R.layout.bubble_progressbar, null);
        bubble_dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        bubble_dialog.getWindow().setBackgroundDrawableResource(R.color.transparent2);
        bubble_dialog.setContentView(view2);
        bubble_dialog.show();

    }

    public static void dismissBubbleDailog()
    {

        bubble_dialog.dismiss();

    }






}
