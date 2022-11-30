<template>
 <v-app id="cart">
    <navbar-store />
    <div class="bg-store">
      <v-container class="container-md my-5 mt-16">
        <h3 class="font-weight-regular mt-6">My Cart | Orders</h3>
        <div v-if="carts.length == 0" >
          <v-card class="my-6">
            <v-container>
              <v-row no-gutters>
                <v-icon class="mr-2" color="yellow darken-2">mdi-alert</v-icon>
                <h3>Your shopping card is empty.</h3>
              </v-row>
                <v-btn class="cute2 mt-6" color="#9293FF" dark rounded :to="{ name: 'store'}">
                  <v-icon class="mr-2">mdi-arrow-left</v-icon>Back to Store
                </v-btn>
            </v-container>
          </v-card>
        </div>
      <!-- <h3 class="font-weight-regular mt-6">My Cart | Orders</h3> -->
      <v-card class="mt-6">
        <v-simple-table>
          <template v-slot:default>
            <thead class="purple lighten-5">
              <tr class="text-center">
                <th class=""><h3>No.</h3></th>
                <th class=""><h3>Products</h3></th>
                <th class=""><h3>Name</h3></th>
                <th class=""><h3>Category</h3></th>
                <th class=""><h3>Full Price</h3></th>
                <th class=""><h3>Discount</h3></th>
                <th class=""><h3>Total Price</h3></th>
                <th class=""><h3>Edit</h3></th>
              </tr>
            </thead>
            <tbody>
              <tr v-for="(item, index) in $store.state.carts" :key="index" class="text-left">
                <td>{{index + 1}}</td>
                <td>
                  <v-img min-height="100px" max-width="130px" :src="item.product_image"></v-img>
                </td>
                <td>{{item.product_name}}</td>
                <td class="">{{item.category_name}}</td>
                <td>
                  <p class="text-decoration-line-through">$ {{(item.product_fullprice).toFixed(2)}}</p>
                </td>
                <td>
                  <p class="">$ {{(item.product_discount).toFixed(2)}}</p>
                </td>
                <td class="product-f">
                  <p class="">$ {{(item.product_totalprice).toFixed(2)}}</p>
                </td>
                <td>
                  <v-btn class="" icon @click="deletecart(item)">
                    <v-icon class="mr-2">mdi-delete</v-icon>
                  </v-btn>
                </td>
              </tr>
            </tbody>
            </template>
          </v-simple-table>
        </v-card>
          <v-card-actions class="d-flex justify-space-between">
            <v-btn class="cute2 mt-6 px-5" color="#9293FF" dark rounded :to="{ name: 'store'}">
              <v-icon class="mr-2">mdi-arrow-left</v-icon>Back to Main Page
            </v-btn>
            <v-card class="mt-6" width="350">
              <v-card-subtitle class="d-flex justify-end">Total Product: {{carts.length}}</v-card-subtitle>
              <v-card-subtitle class="d-flex justify-end">Total Price: $ {{totalPrice.toFixed(2)}}</v-card-subtitle>
              <v-divider class="my-1"></v-divider>
              <v-card-actions class="my-2">
                <v-btn class="cute2" color="#9293FF" dark rounded block @click.stop="dialog = true">
                  <v-icon small class="mr-2" >mdi-credit-card-outline</v-icon>Pay Now
                </v-btn>
              </v-card-actions>
            </v-card>
          </v-card-actions>
    </v-container>
    </div>
          <!-- <v-dialog class="" v-model="dialog">
        <v-card class="pop-up">
          <v-card-title class="justify-center">
            <router-link to="/" class="d-flex align-center">
              <v-img
                src="/logo.png"
                max-height="50px"
                max-width="50px"
                alt="logo"
                contain
                class="me-3"
              ></v-img>
            </router-link>
          </v-card-title>
          <v-card-title class="title justify-center mb-4">
            <h1>Payment Successful</h1>
          </v-card-title>
          <v-card-subtitle class="d-flex justify-center"><p>#Order001</p></v-card-subtitle>
          <v-card-actions>
            <v-btn
              class="cute mb-4"
              dark
              block
              rounded
              color="#9293FF"
              to="/"
              @click="dialog = false"
            >Back to home
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog> -->
      <v-dialog class="pop-up" v-model="dialog">
            <v-card class="card-pay my-4" height="" width="600">
                <v-card-title class="justify-space-between">
                  Pay with card<v-img src="/Mastercard.png" max-height="55px" max-width="55px" class="mr-2"/>
                </v-card-title>
                <v-card-text class="card-text">Card Number
                    <v-text-field
                            v-model="CardNum"
                            outlined
                            rounded
                            placeholder="1234 5678 1234 5678"
                            hide-details
                            class="mt-2"
                            hint="Must have"
                            persistent-hint
                          ></v-text-field>
                </v-card-text>
                <v-card-text class="card-text">Name Card Holder
                    <v-text-field
                            v-model="CardName"
                            outlined
                            rounded
                            placeholder="John Doe"
                            hide-details
                            class="mt-2"
                            hint="Must have"
                            persistent-hint
                          ></v-text-field>
                </v-card-text>
                <v-row no-gutters class="pb-2">
                    <v-col col-3>
                    <v-card-text class="card-text">MM/YY
                    <v-text-field
                            v-model="MY"
                            outlined
                            rounded
                            placeholder="03/21"
                            hide-details
                            class="mt-2"
                            hint="Must have"
                            persistent-hint
                          ></v-text-field>
                </v-card-text>
                </v-col>
                <v-col col-3>
                <v-card-text class="card-text">CVV
                    <v-text-field
                            v-model="CVV"
                            outlined
                            rounded
                            placeholder="678"
                            hide-details
                            class="mt-2"
                            hint="Must have"
                            persistent-hint
                          ></v-text-field>
                </v-card-text>
                </v-col>
                </v-row>
                <v-card-actions class="d-flex justify-end">
            <v-btn class="cute2 px-8" color="#9293FF" dark rounded @click.stop="dialog2 = true">
              <v-icon small class="mr-3">mdi-credit-card-outline</v-icon>Purchase
            </v-btn>
            </v-card-actions>
            </v-card>
      </v-dialog>
      <v-dialog class="" v-model="dialog2">
        <v-card class="pop-up">
          <v-card-title class="justify-center">
            <router-link to="/" class="d-flex align-center">
              <v-img
                src="/logo.svg"
                max-height="50px"
                max-width="50px"
                alt="logo"
                contain
                class="me-3"
              ></v-img>
            </router-link>
          </v-card-title>
          <v-card-title class="title justify-center mb-4">
            <h1>Payment Successful</h1>
          </v-card-title>
          <v-card-subtitle class="d-flex justify-center"><p>#Order001</p></v-card-subtitle>
          <v-card-actions>
            <v-btn
              class="cute mb-4"
              dark
              block
              rounded
              color="#9293FF"
              to="/"
              @click="dialog2 = false"
            >Back to home
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog>
    <!-- Footer -->
  <v-footer color="white" class="font-small " height="auto">
    <v-container class="text-center text-md-left">
      <v-row class="text-center text-md-left mt-3 pb-3">
        <v-col md="3" lg="3" xl="3" class="mx-auto mt-3">
          <v-btn icon rounded to="/" class="mx-auto ml-3 mb-4">
            <v-img
            class=""
            src="/logo.svg"
            max-height="75px"
            max-width="75px"
            alt="logo"
            contain
          ></v-img></v-btn>
          <!-- <h6 class="text-uppercase mb-4 font-weight-bold">Company name</h6> -->
          <p class="mt-3 pb-6">&copy; {{ new Date().getFullYear() }} Country/Region: Thailand</p>
          <!-- <v-col md="8"> -->
          <p class="text-center text-md-left">Community :</p>
          <!-- </v-col> -->
        <!-- <v-col class="d-flex align-items-center"> -->
          <v-btn icon class="mr-3" href="https://play.google.com/store/apps/details?id=com.Drug.Interaction">
            <v-img src="/facebook.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
          <v-btn icon class="mr-3" href="https://play.google.com/store/apps/details?id=com.Drug.Interaction">
            <v-img src="/instagram.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
          <v-btn icon class="mr-3" href="https://play.google.com/store/apps/details?id=com.Drug.Interaction">
            <v-img src="/twitter.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
          <v-btn icon class="mr-3" href="https://play.google.com/store/apps/details?id=com.Drug.Interaction">
            <v-img src="/pinterest.png" max-height="50px" max-width="50px"></v-img>
          </v-btn>
        <!-- </v-col> -->
        </v-col>
        <!-- <hr class="w-100 clearfix d-md-none" /> -->
        <v-col md="2" lg="2" xl="2" class="mx-auto mt-3">
          <h5 class="mb-4 font-weight-medium">MY ACCOUNT</h5>
          <p><a href="/user-info">MY ACCOUNT</a></p>
          <p><a href="/error">MY ORDERS</a></p>
          <p><a href="/error">WISH LIST</a></p>
          <p><a href="/admin">ADMIN</a></p>
        </v-col>
        <!-- <hr class="w-100 clearfix d-md-none" /> -->
        <v-col md="3" lg="2" xl="2" class="mx-auto mt-3">
          <h5 class="mb-4 font-weight-medium">BROWSE CATEGORIES</h5>
          <p><a href="/store">Store</a></p>
          <p><a href="/store">Top Sellers</a></p>
          <p><a href="/store">New Releases</a></p>
          <p><a href="/error">Coming Soon</a></p>
        </v-col>
        <!-- <hr class="w-100 clearfix d-md-none" /> -->
        <v-col md="4" lg="3" xl="3" class="mx-auto mt-3">
          <h5 class="mb-4 font-weight-medium">CONTACT US</h5>
          <p>CUSTOMER SERVICE</p>
          <p>SUPPORT@GMKEYS.COM</p>
          <p>+1 (666) 235-6789</p>
        </v-col>
      </v-row>
    </v-container>
  </v-footer>
  <!-- Footer -->
 </v-app>
</template>

<script>
// const URL = "http://selab.mfu.ac.th:7426";
export default {
  data: () => ({
    dialog: false,
    dialog2: false,
    cartTotal: "",
    carts: [],
    totalPrice: 0,

    products: [],
    filterDex: [],
  }),

  created() {
    this.initialize();
    this.carts = this.$store.state.carts;
  },

  methods: {

    async initialize() {
      console.log("initialize");
      const myCart = localStorage.getItem('myCart');
      let arr = JSON.parse(myCart)
      // console.log('array ',arr)

      const res = await this.$axios.get(URL + "/api/products");
      // console.log(res.data.data.filter(data => arr.includes(data.products_id)))
      // console.log(res.data.data)
      let arrRes = res.data.data
      let products = arr.map(id => {
        let result = (arrRes.filter(data => {
          if (data.product_id == id) {
            return data
          }
        }))[0]
        // console.log('check result', result)
        return result
      })
      console.log('check product',products)
      this.carts = res.data.data.filter(data => arr.includes(data.product_id))
      // let products = res.data.data.filter(data => arr.includes(data.product_id))
      this.$store.commit("updateCart", products)
      // res.data.data.filter(data => {
      //   if (arr.includes(data.product_id)) {
      //     this.$store.commit("addcart", data);
      //   }
      // })
      // this.products = res.data.data;
      this.filterDex = this.products;
    },
    
    addcart(prd) {
      this.$store.commit("addcart", prd);
    },
    deletecart(item) {
      this.$store.commit("deletecart", item);
      const myCart = localStorage.getItem('myCart');
      let arr = JSON.parse(myCart)
      let productIndex = arr.findIndex(id => id == item.product_id)
      arr.splice(productIndex, 1)
      localStorage.setItem('myCart', `[${arr}]`);
      this.initialize()

      
      // console.log('delll', item.product_id)
    },
    // getTotalPrice(){
    //     if(this.$store.state.card != ''){
    //       this.$store.state.card.forEach(item => {
    //         this.totalPrice += item.product_totalprice
    //       })
    //     }
    // },
  }

}
</script>

<style>
.bg-store {
  height: 100%;
  width: 100%;
  position: relative;
  background-size: cover;
  background-position: 50% 50%;
  background-image: url("/bg-shop.png");
}
.pop-up {
  width: 450px;
  opacity: 0.9;
}
.product-f p {
  font-size: 18px;
  font-weight: 700;
  color: #3c186f;
  opacity: 0.9;
  text-shadow: 3px 3px 3px rgba(0, 0, 0, 0.15);
}
.card-pay {
  position: relative;
  background-size: cover;
  background-image: url("/Card-MasterCard.png");
}
.title h1 {
  font-size: 32px;
  color: #6c6c6c;
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
}
</style>