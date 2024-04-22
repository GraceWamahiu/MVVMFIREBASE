package com.example.firebasestorage.ui.theme.screens.clothing

import android.content.Intent
import android.provider.MediaStore
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_DASHBOARD

@Composable
fun ClothingScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "Clothes") })
        //Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            val mContext = LocalContext.current

            Image(
                painter = painterResource(id = R.drawable.winter) ,
                contentDescription = "destination",
                modifier = Modifier
                    .clickable {
                        navController.navigate(ROUT_DASHBOARD)
                        Toast.makeText(mContext,"Clicked on an image!",
                        Toast.LENGTH_SHORT).show() }
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "WINTER COLLECTION",
                    fontSize = 30.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Purchase your Clothes",
                    fontSize = 20.sp)
            }

        }
        //End of box
        Spacer(modifier = Modifier.height(20.dp))
        //Row1
        Row {
            Column {
                Image(painter = painterResource(id = R.drawable.shirt),
                    contentDescription = "shirt1",
                    modifier = Modifier.size(width = 180.dp, height = 100.dp))
                Text(text = "Shirt",
                    fontSize = 20.sp,)
                Text(text = "ksh 1300")

                Button(onClick = { val cameraIntent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                        mContext.startActivity(cameraIntent)
                    }else{
                        println("Camera app is not available")
                    }}) {
                    Text(text = "PAY")

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Image(painter = painterResource(id = R.drawable.gloves),
                    contentDescription = "shirt1",
                    modifier = Modifier.size(width = 180.dp, height = 100.dp))
                Text(text = "Gloves",
                    fontSize = 20.sp,)
                Text(text = "ksh 1300")

                Button(onClick = { val cameraIntent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                        mContext.startActivity(cameraIntent)
                    }else{
                        println("Camera app is not available")
                    }}) {
                    Text(text = "PAY")

                }
            }

        }
        //end of row1
        Spacer(modifier = Modifier.width(10.dp))
        //Row2
        Row {
            Column {
                Image(painter = painterResource(id = R.drawable.jacket),
                    contentDescription = "shirt1",
                    modifier = Modifier.size(width = 180.dp, height = 100.dp))
                Text(text = "Jacket",
                    fontSize = 20.sp,)
                Text(text = "ksh 1300")

                Button(onClick = { val cameraIntent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                        mContext.startActivity(cameraIntent)
                    }else{
                        println("Camera app is not available")
                    }}) {
                    Text(text = "PAY")

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Image(painter = painterResource(id = R.drawable.scarf),
                    contentDescription = "shirt1",
                    modifier = Modifier.size(width = 180.dp, height = 100.dp))
                Text(text = "Scarf",
                    fontSize = 20.sp,)
                Text(text = "ksh 1300")

                Button(onClick = { val cameraIntent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                        mContext.startActivity(cameraIntent)
                    }else{
                        println("Camera app is not available")
                    }}) {
                    Text(text = "PAY")

                }
            }

        }
        //end of row2











        }
    }


@Preview(showBackground = true)
@Composable
fun ClothingScreenPreview() {
    ClothingScreen(rememberNavController())
}