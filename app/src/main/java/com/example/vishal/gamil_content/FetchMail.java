package com.example.vishal.gamil_content;

/**
 * Created by Vishal on 2/27/2018.
 */

import android.util.Log;

import java.io.IOException                 ;
import java.util.Properties                ;


public class FetchMail {
//    public static String[] UnreadMail(
//            String server   ,
//            String folder   ,
//            String from     ,
//            String username ,
//            String password
//    ) {
//        Properties props = System.getProperties()                                     ;
//        props.setProperty("mail.store.protocol", "imaps")                             ;
//        try {
//            Session session  = Session.getDefaultInstance(props, null)                ;
//            Store store      = session.getStore("imaps")                              ;
//            store.connect(server, username, password)                                 ;
//            Folder inbox     = store.getFolder(folder)                                ;
//            inbox.open(Folder.READ_WRITE)                                             ;
//            FlagTerm ft      = new FlagTerm(new Flags(Flags.Flag.SEEN), false)        ;
//            Message msgs[]   = inbox.search(ft)                                       ;
//
//            String[] emails  = new String[msgs.length]                                ;
//            String[] content = new String[msgs.length]                                ;
//
//            if (msgs.length > 0)
//            {
//                for (int i = 0; i < msgs.length ; i++)
//                {
//                    emails[i] = ((InternetAddress) msgs[i].getFrom()[0]).getAddress() ;
//                    if (emails[i].equals(from))
//                    {
//                        content[i] = msgs[i].getContent().toString()                  ;
//                    }
//                }
//            }
//            store.close()                                                             ;
//            return content                                                            ;
//        }
//        catch (NoSuchProviderException e) {
//            return null                                                               ;
//        }
//        catch (MessagingException e) {
//            return null                                                               ;
//        }
//        catch (IOException e) {
//            return null                                                               ;
//        }
//    }




}