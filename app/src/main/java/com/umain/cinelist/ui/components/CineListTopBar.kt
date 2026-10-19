package com.umain.cinelist.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.umain.cinelist.R
import com.umain.cinelist.ui.theme.CinelistTheme

@Composable
fun CineListTopBar(
    onLogoClick: () -> Unit,
    modifier: Modifier = Modifier,
    onWatchlistClick: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Cine List",
            style = MaterialTheme.typography.displayMedium,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.clickable { onLogoClick() }
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.clickable { onWatchlistClick() }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_bookmark),
                contentDescription = "list",
                tint = MaterialTheme.colorScheme.primary,
            )
            Text(text = "My watch list",
                style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.onBackground,
            )}
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF0D0D12)
@Composable
fun CineListTopBarPreview() {
    CinelistTheme {
        CineListTopBar(
            onLogoClick = {},
            onWatchlistClick = {}
        )
    }
}
