package mx.com.androiddes.soe;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by roboxito on 29/10/15.
 */
public class utils {
    public static void Mensaje(final Context ctx,String msj, DialogInterface.OnDismissListener proc) {
        if(ctx!=null) {
           // Log.d("Dialogo Mensaje invocado desde: "+((Activity)ctx).getClass().getName());
            final Dialog builder=new Dialog(ctx);
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
            LayoutInflater inflater=(LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);

            View v=inflater.inflate(R.layout.dialog, null);
            TextView titulo=(TextView) v.findViewById(R.id.textDialog);
            Button btn=(Button) v.findViewById(R.id.declineButton);
            //ImageView btn_cerrar=(ImageView) v.findViewById(R.id.declineButton);
            TextView mensaje=(TextView) v.findViewById(R.id.textDialog);
           // titulo.setText(tit);
            mensaje.setText(msj);
            builder.setContentView(v);
            builder.setCancelable(false);
            builder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            //btn.setVisibility(View.INVISIBLE);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {					// TODO Auto-generated method stub
                  /*  if(Back==TIPO_SALIR.HOMEPRIV) {
                       *//* Intent intent = new Intent(ctx,LogHomeActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        ctx.startActivity(intent);*//*
                    } else if(Back==TIPO_SALIR.HOMEPUB){
                        *//*Intent intent2 = new Intent(ctx, HomeActivity.class);
                        intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        ctx.startActivity(intent2);*//*
                    } else if(Back==TIPO_SALIR.FINALIZAR) {
                        ((Activity)ctx).finish();
                    }*/
                    builder.dismiss();
                }
            });
            if(proc!=null) {

                builder.setOnDismissListener(proc);
            }
            builder.show();

        }
    }
}
