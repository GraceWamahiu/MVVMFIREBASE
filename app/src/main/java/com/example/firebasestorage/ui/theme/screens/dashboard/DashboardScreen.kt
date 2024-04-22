package com.example.firebasestorage.ui.theme.screens.dashboard

import android.content.Intent
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
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.InsertActivity
import com.example.firebasestorage.navigation.ROUT_CLOTHING
import com.example.firebasestorage.ui.theme.lBlue

@Composable
fun DashboardScreen(navController: NavHostController) {


    Column(modifier = Modifier.fillMaxSize()) {
        //TopAppBar
        TopAppBar(title = { Text(text = "Amazon Shop") },
            backgroundColor = lBlue
        )
    //End of TopAppBar
        Spacer(modifier = Modifier.height(30.dp))
        //Row
        Row {
            Column {
                Text(text = "Amazon", fontSize = 30.sp,
                    color = Color.Blue, fontFamily = FontFamily.Serif)
                Text(text = "Shop from A to Z", fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.width(80.dp))

            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.amazon),
                contentDescription ="amazon",
                modifier = Modifier.size(100.dp))
        }
        //End of Row
        Spacer(modifier = Modifier.height(30.dp))
        //column2
        Column {
            //Row1
            Row {
                val mContext = LocalContext.current
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)
                    .clickable {
                        navController.navigate(ROUT_CLOTHING)
                        Toast.makeText(mContext,"Go to clothing screen!",
                            Toast.LENGTH_SHORT).show()
                    }) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.dress),
                                contentDescription ="amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Clothing", fontSize = 15.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }



                }
                Card(modifier = Modifier
                    .clickable {
                        mContext.startActivity(Intent(mContext,InsertActivity::class.java))
                    }
                    .size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.electronics),
                                contentDescription ="amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Electronics", fontSize = 15.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }

                }
            }
            //end of row1
            Spacer(modifier = Modifier.height(20.dp))
            //Row2
            Row {
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.homee),
                                contentDescription ="amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Home", fontSize = 15.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }



                }
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.beaurry),
                                contentDescription ="amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Beauty", fontSize = 15.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }



                }
            }
            //end of row2
            Spacer(modifier = Modifier.height(20.dp))
            //Row1
            Row {
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.pharm),
                                contentDescription ="amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Pharmacy", fontSize = 15.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }



                }
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){

                            Image(painter = painterResource(id = com.example.firebasestorage.R.drawable.groceries),
                                contentDescription ="amazon",
                                modifier = Modifier.size(80.dp))
                        }
                        Text(text = "Groceries", fontSize = 15.sp,
                            color = lBlue, modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                }
            }
            //end of row1
            Spacer(modifier = Modifier.height(20.dp))



        }

    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    DashboardScreen(rememberNavController())
}