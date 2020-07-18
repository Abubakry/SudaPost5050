package com.example.sudapost5050;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;







        // Add a marker in Sydney and move the camera

        LatLng sudan = new LatLng( 15.579259, 32.575015);
        mMap.addMarker(new MarkerOptions()
                        .position(sudan)
                        .title("شارع الستين")
                        .icon(BitmapDescriptorFactory
                                .defaultMarker(BitmapDescriptorFactory.HUE_BLUE))


        );




        // Add a marker in Sydney and move the camera
        LatLng site02 = new LatLng( 15.52726956,32.5432889);
        mMap.addMarker(new MarkerOptions()
                        .position(site02)
                        .title("الميناء البري")

        );



        // Add a marker in Sydney and move the camera
        LatLng site03 = new LatLng( 15.607523,32.526139);
        mMap.addMarker(new MarkerOptions()
                        .position(site03)
                        .title("سودابوست الخرطوم")

        );


        // Add a marker in Sydney and move the camera
        LatLng site04 = new LatLng( 15.579841,32.544062);
        mMap.addMarker(new MarkerOptions()
                        .position(site04)
                        .title("فرع العمارات")

        );


        // Add a marker in Sydney and move the camera
        LatLng site05 = new LatLng( 15.593456,32.546565);
        mMap.addMarker(new MarkerOptions()
                        .position(site05)
                        .title("مطار الخرطوم")

        );


        // Add a marker in Sydney and move the camera
        LatLng site06 = new LatLng( 15.578276,32.524617);
        mMap.addMarker(new MarkerOptions()
                        .position(site06)
                        .title("فرع السجانة")

        );




        LatLng site07 = new LatLng(15.645438, 32.482536);
        mMap.addMarker(new MarkerOptions()
                .position(site07)
                .title("فرع أمدرمان").snippet("ميدان البوسته"));




        LatLng site08 = new LatLng(15.621111, 32.534701);
        mMap.addMarker(new MarkerOptions().position(site08).title("فرع بحري"));




        LatLng site09 = new LatLng(15.609372, 32.540291);
        mMap.addMarker(new MarkerOptions()
                .position(site09)
                .title("جامعة الخرطوم").snippet("مبنى السنتر"));




        LatLng site10 = new LatLng(15.533191, 32.568517);
        mMap.addMarker(new MarkerOptions()
                .position(site10)
                .title("جامعة افريقيا").snippet("الأزهري"));



        LatLng site11 = new LatLng(15.648555, 32.420342);
        mMap.addMarker(new MarkerOptions()
                .position(site11)
                .title("سوق ليبيا").snippet("شارع الأربعين"));





        LatLng site12 = new LatLng(15.669757, 32.484591);
        mMap.addMarker(new MarkerOptions()
                .position(site12)
                .title("جامعة امدرمان الإسلامية").snippet("  ام درمان بمبانى الجامعة شارع الثورة بالنص "));






        LatLng site13 = new LatLng(15.556577, 32.552897);
        mMap.addMarker(new MarkerOptions()
                .position(site13)
                .title("مكتب بريد السجل المدني").snippet("   الادارة العامة للسجل المدنى والجوازات الخرطوم شارع النيل "));






        LatLng site14 = new LatLng(15.593456, 32.546565);
        mMap.addMarker(new MarkerOptions()
                .position(site14)
                .title("سوق ليبيا").snippet("شارع الأربعين"));





        LatLng site15 = new LatLng(15.648555, 32.420342);
        mMap.addMarker(new MarkerOptions()
                .position(site15)
                .title("سوق ليبيا").snippet("شارع الأربعين"));








        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {


            public View getInfoWindow(Marker marker) {
                return null;
            }


            public View getInfoContents(Marker marker) {

                View v = getLayoutInflater().inflate(R.layout.info_windows, null);
                ImageView imageView = (ImageView) v.findViewById(R.id. imageView);
                TextView tvLocality = (TextView) v.findViewById(R.id.tvLocality);
                TextView tvLat = (TextView) v.findViewById(R.id.tvLat);
                TextView tvLng = (TextView) v.findViewById(R.id.tvLng);
                TextView tvSinppet = (TextView) v.findViewById(R.id.tvSnippet);
                TextView tvSinppetAdd = (TextView) v.findViewById(R.id.tvSnippetAdd);
                TextView tvTel = (TextView) v.findViewById(R.id.tvTel);


                LatLng latLng = marker.getPosition();
                tvLocality.setText(marker.getTitle());
                tvLat.setText(" Latitute  " + latLng.latitude);
                tvLng.setText(" Longitute  " + latLng.longitude);
//                tvSinppet.setText(marker.getSnippet());
                //  tvSinppetAdd.setText("امام قسم الرياض");


                //if (responseStr == "abc"

                //  if (marker.getId().equals(1)  )





                if (marker.getTitle().equalsIgnoreCase("شارع الستين"))


                {
                    tvSinppetAdd.setText("شركة سودابت فرع شارع الستينى");
                    imageView.setImageResource(R.drawable.reyadoffice);


                    tvTel.setText("Tel:0123266714");




                }




                if (marker.getTitle().equalsIgnoreCase("الميناء البري"))


                {
                    tvSinppetAdd.setText(" مبنى الميناء البرى الخرطوم السوق المحلى");
                    imageView.setImageResource(R.drawable.menabari);
                    tvTel.setText("Tel:0123366099");


                }




                if (marker.getTitle().equalsIgnoreCase("سودابوست الخرطوم"))


                {
                    tvSinppetAdd.setText("شارع الجامعة جوار القصر الجمهورىن");
                    imageView.setImageResource(R.drawable.baredwabarq);
                    tvTel.setText("Tel:0123488814");

                }




                if (marker.getTitle().equalsIgnoreCase("فرع العمارات"))


                {
                    tvSinppetAdd.setText("العمارات شارع 15");
                    imageView.setImageResource(R.drawable.baredwabarq);
                    tvTel.setText("Tel:0123488814");


                }








                if (marker.getTitle().equalsIgnoreCase("مطار الخرطوم"))


                {
                    tvSinppetAdd.setText("غرب مبنى الوصــول");
                    imageView.setImageResource(R.drawable.krt_airport);
                    tvTel.setText("Tel:0123488814");


                }








                if (marker.getTitle().equalsIgnoreCase("فرع السجانة"))


                {
                    tvSinppetAdd.setText("سوق السجانة شمال تقاطع ابوحمامة");
                    imageView.setImageResource(R.drawable.alsajana2);
                    tvTel.setText("Tel:0123488814");


                }






                if (marker.getTitle().equalsIgnoreCase("فرع بحري"))


                {
                    tvSinppetAdd.setText("جوار محكمة بحري");
                    imageView.setImageResource(R.drawable.bahariiii5);
                    tvTel.setText("Tel:0123488814");


                }







                if (marker.getTitle().equalsIgnoreCase("سوق ليبيا"))


                {
                    tvSinppetAdd.setText("امام قسم yyyyyyyy");
                    imageView.setImageResource(R.drawable.souglypiya);
                    tvTel.setText("Tel:0123488896");

                }





                if (marker.getTitle().equalsIgnoreCase("جامعة افريقيا"))


                {
                    tvSinppetAdd.setText("الأزهري");
                    imageView.setImageResource(R.drawable.aaabbb);
                    tvTel.setText("Tel:0123488814");


                }






                if (marker.getTitle().equalsIgnoreCase("فرع سوق ابوزيد"))


                {
                    tvSinppetAdd.setText("   سوق ليبيا   ");
                    imageView.setImageResource(R.drawable.souglypiya);
                    tvTel.setText("Tel:0123488814");


                }



                if (marker.getTitle().equalsIgnoreCase("جامعة امدرمان الإسلامية"))


                {
                    tvSinppetAdd.setText("   سوق ليبيا   ");
                    imageView.setImageResource(R.drawable.oeu);
                    tvTel.setText("Tel:0123488814");


                }







                if (marker.getTitle().equalsIgnoreCase("فرع شرق النيل"))


                {
                    tvSinppetAdd.setText("البوابة الرئيسية مستشفى شرق النيل ");
                    imageView.setImageResource(R.drawable.souglypiya);
                    tvTel.setText("Tel:0123488820");


                }










                return v;
            }



        });







        LatLng mark = new LatLng(15.607970, 32.525853);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mark,10));








    }






    public class MarkerDemoActivity extends AppCompatActivity implements
            GoogleMap.OnInfoWindowClickListener,
            OnMapReadyCallback {

        private GoogleMap mMap;

        @Override
        public void onMapReady(GoogleMap map) {
            mMap = map;


            LatLng site10 = new LatLng(15.533191, 32.568517);
            mMap.addMarker(new MarkerOptions()
                            .position(site10)
                            .title("جامعة افريقيا").snippet("الأزهري")


            );


        }

        @Override
        public void onInfoWindowClick(Marker marker) {
            Toast.makeText(this, "Info window clicked",
                    Toast.LENGTH_SHORT).show();
        }
    }





    public void onInfoWindowClick(Marker marker) {
        Toast.makeText(this, "Info window clicked",
                Toast.LENGTH_SHORT).show();
    }







}
