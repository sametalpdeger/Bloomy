import androidx.compose.runtime.Composable

@Composable
expect fun EmptyContextMenu(
    content: @Composable () -> Unit
): Unit
