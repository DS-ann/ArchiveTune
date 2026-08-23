/*
 * ArchiveTune (2026)
 * © Rukamori — github.com/rukamori
 * GPL-3.0 License | Contributors: see git history
 * Do not remove or alter this notice. - Per GPL-3.0 Section 4 & Section 5
 */

package moe.rukamori.archivetune.cast

import android.content.Context
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * API-23-safe fallback used when the optional Cast implementation is unavailable.
 * It deliberately keeps casting disabled rather than requiring a newer Cast stack.
 */
class DefaultCastPlaybackRepository(
    @Suppress("UNUSED_PARAMETER") context: Context,
) : CastPlaybackRepository {
    private val _screenState = MutableStateFlow<CastScreenState>(CastScreenState.Empty)
    override val screenState: StateFlow<CastScreenState> = _screenState

    override fun createPlayer(
        context: Context,
        localPlayer: ExoPlayer,
        mediaItemResolver: CastMediaItemResolver,
    ): Player = localPlayer

    override fun disconnect() = Unit

    override fun setVolume(volume: Float) = Unit
}
