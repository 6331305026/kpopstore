<template>
<v-app id="view">
  <navbar-store />
    <div class="bg-store">
      <v-container class="mt-16 pt-10">
        <h3 class="font-weight-regular ">STORE | {{ prd.name }}</h3>
        <v-layout wrap class="my-8">
          <v-row no-gutters class="justify-center">
            <v-col class="ml-16" cols="3">
              <v-img class="" height="100%" :src="prd.pic"></v-img>
            </v-col>
            <v-col cols="8">
              <v-card class="mx-16 my-4">
                  <v-card-title class="justify-space-between">{{ prd.name }}
                    <v-btn icon class="mx-2" color="#EF5DA8" dark rounded>
                    <v-icon>mdi-heart</v-icon>
                  </v-btn>
                  </v-card-title>
                  <v-card-text>{{ prd.desc }}</v-card-text>
              </v-card>
              <v-card class="mx-16">
                <v-row no-gutters class="justify-space-between">
                  <v-col cols="3">
                  <v-card-subtitle class="mx-4">
                  <div class="product-f pt-6 pb-2">
                    <h2 class="font-weight-bold text-decoration-line-through">RRP $ {{ prd.price }}</h2>
                  </div>
                  <div class="product-t">
                    <h2 class="font-weight-bold">$ {{ prd.price }}</h2>
                  </div>
                </v-card-subtitle>
                </v-col>
                <v-col cols="4">
                  <v-card-subtitle class="my-9">
                    <v-row class="">
                    <div class="type1 mx-3">
                    <caption class="ml-2 text-uppercase font-weight-bold grey--text">band</caption>
                    <v-chip class='chip text-uppercase white--text' color='#FF90C9' small>
                      K-pop
                    </v-chip></div>
                    <div class="type2 ">
                    <caption class="ml-4 text-uppercase font-weight-bold grey--text">platform</caption>
                    <v-chip class='text-uppercase white--text' color='#FF90C9' small>
                      Limited
                    </v-chip>
                    </div>
                    </v-row>
                  </v-card-subtitle>
                </v-col>
                <v-col cols="4">
                  <v-card-actions>
                    <div class="btn my-6">
                    <v-btn class="cute2 my-3" color="#9293FF" dark rounded block @click="addcart(prd)">
                    <v-icon small class="mr-2">mdi-cart</v-icon>Add to Cart
                    </v-btn>
                    <v-btn class="cute2" color="#9293FF" dark rounded block :to="{ name: 'payment', params: { pid: prd.id }, }">
                      <v-icon small class="mr-2">mdi-credit-card-outline</v-icon>Pay Now
                    </v-btn>
                    </div>
                  </v-card-actions>
                </v-col>
                </v-row>
                <!-- <v-card-text class="mx-4">
                  <div class="type1 pt-6 pb-2">
                    <caption class="ml-2 text-uppercase font-weight-bold grey--text">genre
                      <v-chip
                      color="#9293FF"
                      link
                      outlined
                      small
                      >HORROR, MULTIPLAYER, SURVIVAL</v-chip>
                    </caption>
                  </div>
                </v-card-text> -->
              </v-card>
            </v-col>
          </v-row>
        </v-layout>
      </v-container>
    </div>
    <!-- Footer -->
    <v-footer color="white" class="font-small" height="auto">
      <v-container class="text-center text-md-left">
        <v-row class="text-center text-md-left mt-3 pb-3">
          <v-col md="3" lg="3" xl="3" class="mx-auto mt-3">
            <v-btn
              icon
              rounded
              to="/"
              class="mx-auto ml-3 mb-4"
            >
              <v-img
                class=""
                src="/logo.png"
                max-height="75px"
                max-width="75px"
                alt="logo"
                contain
              ></v-img
            ></v-btn>
            <!-- <h6 class="text-uppercase mb-4 font-weight-bold">Company name</h6> -->
            <p class="mt-3 pb-6">
              &copy; {{ new Date().getFullYear() }} Country/Region: Thailand
            </p>
            <!-- <v-col md="8"> -->
            <p class="text-center text-md-left">Community :</p>
            <!-- </v-col> -->
            <!-- <v-col class="d-flex align-items-center"> -->
            <v-btn icon class="mr-3" to="">
              <v-img
                src="/facebook.png"
                max-height="50px"
                max-width="50px"
              ></v-img>
            </v-btn>
            <v-btn icon class="mr-3" to="">
              <v-img
                src="/instagram.png"
                max-height="50px"
                max-width="50px"
              ></v-img>
            </v-btn>
            <v-btn icon class="mr-3" to="">
              <v-img
                src="/twitter.png"
                max-height="50px"
                max-width="50px"
              ></v-img>
            </v-btn>
            <v-btn icon class="mr-3" to="">
              <v-img
                src="/pinterest.png"
                max-height="50px"
                max-width="50px"
              ></v-img>
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
import Axios from "axios";
export default {
  data: () => ({
    prd: {},
  }),

  created() {
    this.initialize();
  },

  methods: {
    async initialize() {
      Axios.get('/api/products',{ params: this.$route.params.name }).then((res) => {
        console.log(this.$route.params.pid);
        this.prd = res.data.data[0];
        console.log(this.prd)
      })
      // console.log("initialize");
      // console.log(this.$route.params.pid);
      // const res = await this.$axios.get(URL + "/api/products/" + this.$route.params.pid);
      // console.log(res);
      // this.prd = res.data.data[0];
      // console.log(this.prd)
    },

    addcart(prd) {
      this.$store.commit("addcart", prd);
    },
  },
};
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
.product-t h2 {
  font-size: 28px;
  font-weight: 300;
  color: #3c186f;
  text-shadow: 3px 3px 3px rgba(0, 0, 0, 0.15);
}
.product-f h2 {
  font-size: 16px;
  font-weight: 700;
  color: #3c186f;
  opacity: 0.6;
  text-shadow: 3px 3px 3px rgba(0, 0, 0, 0.15);
}
.type1 caption {
  font-size: 10px;
  text-shadow: 3px 3px 3px rgba(0, 0, 0, 0.15);
}
.type2 caption {
  text-shadow: 3px 3px 3px rgba(0, 0, 0, 0.15);
  font-size: 10px;
}
.cute2 {
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  background: linear-gradient(0deg, rgba(255, 255, 255, 0.2), rgba(255, 255, 255, 0.2)), linear-gradient(90.72deg, #9293FF 16.46%, #FF90C9 100%);
}
</style>