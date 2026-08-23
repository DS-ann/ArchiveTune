/*
 * ArchiveTune (2026)
 * © Rukamori — github.com/rukamori
 * GPL-3.0 License | Contributors: see git history
 */

package moe.rukamori.archivetune.ui.menu

import androidx.compose.runtime.Composable
import moe.rukamori.archivetune.ui.component.NewAction

/**
 * Cast controls are intentionally unavailable in the API-23 compatibility build.
 * Returning null keeps the player menu functional without requiring the incomplete
 * optional Cast implementation.
 */
@Composable
fun rememberCastPlayerMenuAction(): NewAction? = null
