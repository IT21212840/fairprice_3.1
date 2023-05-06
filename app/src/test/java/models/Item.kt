package models

data class Item(
    val name: String,
    val id: String,
    val price: Double,
    val inStock: Boolean,
    val description: String,
    val imageUrl: String
)