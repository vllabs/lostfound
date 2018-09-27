package com.example.vishal.gamil_content;

import android.os.AsyncTask;
import android.util.Log;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;

/**
 * Created by Vishal on 2/27/2018.
 */

public class MyAsynk extends AsyncTask<Void, Void, Void> {

    @Override
    protected Void doInBackground(Void... params) {

        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(props, null);
            Store store = session.getStore();
            store.connect("imap.gmail.com", "youremail@gmail.com", "password");
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            javax.mail.Message msg = inbox.getMessage(inbox.getMessageCount());
            javax.mail.Address[] in = msg.getFrom();
            for (javax.mail.Address address : in) {
                System.out.println("FROM:" + address.toString());
            }
            Multipart mp = (Multipart) msg.getContent();
            BodyPart bp = mp.getBodyPart(0);
            System.out.println("SENT DATE:" + msg.getSentDate());
            System.out.println("SUBJECT:" + msg.getSubject());
            System.out.println("CONTENT:" + bp.getContent());
            Log.e("SENT DATE:" , msg.getSentDate().toString());
            Log.e("SUBJECT:" , msg.getSubject().toString());
            Log.e("CONTENT:",bp.getContent().toString());
        } catch (Exception mex) {
            mex.printStackTrace();
        }

        return null;
    }
}
