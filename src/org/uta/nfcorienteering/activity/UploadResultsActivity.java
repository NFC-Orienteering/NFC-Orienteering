package org.uta.nfcorienteering.activity;

import com.example.nfcorienteering.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class UploadResultsActivity extends Activity {

	EditText nicknameTextField;
	Button uploadResultsButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_upload_results);
		
		nicknameTextField = (EditText)findViewById(R.id.nicknameTextField);
		uploadResultsButton = (Button)findViewById(R.id.uploadButton);
		
	}


	public void uploadResults(View v){
		
		/*
		 * In this method the process of uploading the results to 
		 * webserver should be implemented. After that, return back to MainActivity.class
		 * 
		 */
	}
}