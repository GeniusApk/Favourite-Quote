package com.geniusapk.favouritequote

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun prevew() {

    LazyColumn(content = {
        items(getCategortList()) { item ->
            BlogeCat(imag = item.imag, author = item.author, quote = item.quote)


        }

    })


}

@Composable
fun BlogeCat(imag: Int, author: String, quote: String) {
    var showDialog by remember { mutableStateOf(false) }

    Card(modifier = Modifier
        .padding(8.dp)
        .clickable { showDialog = true }) {

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = imag),
                contentDescription = "",
                alignment = Alignment.TopStart,
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            extracted(author, quote, Modifier.weight(.8f))
        }

    }
    if (showDialog) {
        AlertDialog(onDismissRequest = { showDialog = false },
            confirmButton = {},
            title = { Text(text = author) },
            text = {
                Text(
                    text = quote,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center // Specify the desired text alignment here


                )
            }


        )

    }


}

@Composable
private fun extracted(author: String, quote: String, modifier: Modifier) {

    Column(modifier = modifier) {
        Text(
            text = quote,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold

        )


        Text(
            text = author,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(top = 4.dp),

            )


    }
}


data class Categort(val imag: Int, val author: String, val quote: String)

fun getCategortList(): MutableList<Categort> {
    val list = mutableListOf<Categort>()

    list.add(
        Categort(
            R.drawable.quote_24,
            "Buddha",
            "The mind is everything. What you think you become."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "William Shakespeare",
            "We know what we are, but not what we may be."
        )
    )
    list.add(Categort(R.drawable.quote_24, "Oprah Winfrey", "You become what you believe."))
    list.add(
        Categort(
            R.drawable.quote_24,
            "Vincent Van Gogh",
            "I am seeking, I am striving, I am in it with all my heart."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Coco Chanel",
            "In order to be irreplaceable one must always be different."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Bruce Lee",
            "Knowing is not enough, we must apply. Willing is not enough, we must do."
        )
    )
    list.add(Categort(R.drawable.quote_24, "Abraham Lincoln", "Whatever you are, be a good one."))
    list.add(
        Categort(
            R.drawable.quote_24,
            "Henry Ford",
            "Whether you think you can, or you think you can't – you're right."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Winston Churchill",
            "Success is not final, failure is not fatal: It is the courage to continue that counts."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Rumi",
            "The wound is the place where the Light enters you."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Jim Rohn",
            "Either you run the day, or the day runs you."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Harriet Tubman",
            "Every great dream begins with a dreamer. Always remember, you have within you the strength, the patience, and the passion to reach for the stars to change the world."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Napoleon Hill",
            "Whatever the mind can conceive and believe, it can achieve."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "C.S. Lewis",
            "You are never too old to set another goal or to dream a new dream."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Dalai Lama",
            "Happiness is not something ready-made. It comes from your own actions."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Malala Yousafzai",
            "We realize the importance of our voices only when we are silenced."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Anne Frank",
            "How wonderful it is that nobody need wait a single moment before starting to improve the world."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Mae Jemison",
            "Never be limited by other people's limited imaginations."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Stephen Hawking",
            "However difficult life may seem, there is always something you can do and succeed at."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Eleanor Roosevelt",
            "Do one thing every day that scares you."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Audrey Hepburn",
            "Nothing is impossible, the word itself says 'I'm possible'!"
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Maya Angelou",
            "If you don't like something, change it. If you can't change it, change your attitude."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Marcus Aurelius",
            "Very little is needed to make a happy life; it is all within yourself, in your way of thinking."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Albert Schweitzer",
            "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Helen Keller",
            "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart."
        )
    )
    list.add(
        Categort(
            R.drawable.quote_24,
            "Ralph Waldo Emerson",
            "What lies behind us and what lies before us are tiny matters compared to what lies within us."
        )
    )

    return list
}
