package com.example.androidrxjav2test;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestRxjavaActivity extends AppCompatActivity {


    private Api api;
    private static final String TAG = "TestRxjavaActivity";
    private WebView webView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testrxjava);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://mobile.xinghengedu.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(Api.class);
        webView = findViewById(R.id.webview);
    }

    public void click(View view){
//        Observable<String> observable = getObservable();
//        Observer<String> observer = getObserver();
//        observable.subscribe(observer);

        getInfoFromNet();
    }

    public void getInfoFromNet(){
//        Disposable dis = Observable.create(new ObservableOnSubscribe<User>() {
//            @Override
//            public void subscribe(ObservableEmitter<User> emitter) throws Exception {
//                User user = api.getUserInfoWithPath("15225895187", "ZHIYEYISHI").execute().body();
//                emitter.onNext(user);
//                emitter.onComplete();
//            }
//        }).subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<User>() {
//                    @Override
//                    public void accept(User user) throws Exception {
//                        Log.e(TAG, user.toString());
//                    }
//                });

        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url("https://voice.baidu.com/act/newpneumonia/newpneumonia/?from=osari_pc_3&city=北京-北京")
                .get()
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                Log.e("asdas---->", String.valueOf(Looper.getMainLooper() == Looper.myLooper()));
                String str = response.body().string();
                showWebView(str);
            }
        });
    }

    private void showWebView(final String str) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setEnabled(false); //禁止webview滑动
                webView.setScrollContainer(false);
                webView.setHorizontalScrollBarEnabled(false);//水平不显示
                webView.setVerticalScrollBarEnabled(false); //垂直不显示
                 webView.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);

            }
        });
    }


    public Observable<String> getObservable(){
        return Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {

                User user = api.getUserInfoWithPath("15225895187","ZHIYEYISHI").execute().body();

            }
        });
    }

    public Observer<String> getObserver(){
        return new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                Log.e("Sdasd--->",s);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
     }

}
