package br.com.l13.senac.sp.googlemapsapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

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
        LatLng senacl13 = new LatLng(-23.6471254, -46.7038018);
        mMap.addMarker(new MarkerOptions().position(senacl13).title("SENAC Largo Treze"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(senacl13));




        final LatLng PQIBIRAPUERA = new LatLng(-23.5874162, -46.6576336);
        Marker pqIbirapuera = mMap.addMarker(new MarkerOptions()
                .position(PQIBIRAPUERA)
                .title("Parque Ibirapuera")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .draggable(true));

        final LatLng MTDISCOVERDE = new LatLng(-23.6493966, -46.6764958);
        Marker mtDiscoVerde = mMap.addMarker(new MarkerOptions()
                .position(MTDISCOVERDE)
                .title("Motel Disco Verde")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
                .draggable(true));



    }
}
