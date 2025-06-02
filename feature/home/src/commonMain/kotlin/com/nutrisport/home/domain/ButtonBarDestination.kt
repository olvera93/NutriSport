package com.nutrisport.home.domain

import org.jetbrains.compose.resources.DrawableResource
import com.nutrisport.shared.navigation.Screen
import com.nutrisport.shared.Resources

enum class ButtonBarDestination(
    val icon: DrawableResource,
    val title: String,
    val screen: Screen
) {

    ProductOverview(
        icon = Resources.Icon.Home,
        title = "Nutri Sport",
        screen = Screen.ProductsOverview
    ),

    Cart(
        icon = Resources.Icon.ShoppingCart,
        title = "Cart",
        screen = Screen.Cart
    ),

    Categories(
        icon = Resources.Icon.Categories,
        title = "Categories",
        screen = Screen.Categories
    )

}