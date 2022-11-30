<template>
  <v-app id="store">
    <navbar-store />
    <div class="bg-store">
      <v-container class="mt-16 pt-10" :search="search">
        <v-row class="">
          <h3 class="font-weight-regular">STORE | ALL</h3>
          <v-text-field
            v-model="search"
            label="Search"
            rounded
            dense
            outlined
            prepend-inner-icon="mdi-magnify"
            hide-details
            placeholder="Find a match ..."
            class="col-3 ml-6 mb-4"
            color="#9293FF"
          ></v-text-field>
        </v-row>
        <v-layout wrap>
          <v-flex
            lg3
            md3
            sm4
            xs6
            v-for="(prd, idx) in this.filterDex"
            :key="idx"
          >
            <v-card justify-space-between class="mx-4 my-4">
              <v-img
                class="white--text align-end"
                height="200px"
                :src="prd.product_image"
              >
              </v-img>
              <v-card-title class="pb-2 justify-space-between">{{ prd.name }}
                <v-chip
                color="#9293FF"
                link
                outlined
                small
                >{{ prd.band.bandName }}</v-chip>
              </v-card-title>
            <!-- <v-card-subtitle class="pb-0">
             <v-chip
                color="#9293FF"
                link
                outlined
                small
             >{{ prd.category_name }}</v-chip>
            </v-card-subtitle> -->
              <v-card-subtitle class="pb-2">
                <div class="product-ttp">
                  <h4 class="font-weight-bold">$ {{ prd.price }}</h4>
                </div>
                <div class="product-fp">
                  <h4 class="font-weight-bold text-decoration-line-through">
                    $ {{ prd.desc}}
                  </h4>
                </div>
              </v-card-subtitle>

              <v-card-actions class="justify-space-between">
                <v-btn class="cute ml-2 px-6" color="#9293FF" dark small :to="{ name: 'product-view', params: { pid: prd.product_id }, }"
                >View
                </v-btn>
                <div class="btn">
                    <v-btn icon class="" color="#9293FF" dark rounded outlined @click="addcart(prd)">
                    <v-icon>mdi-cart</v-icon>
                    </v-btn>
                    <v-btn icon class="mx-2" color="#9293FF" dark rounded outlined>
                    <v-icon>mdi-heart</v-icon>
                    </v-btn>
                </div>
              </v-card-actions>
            </v-card>
          </v-flex>
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
    info: [],
    search: "",
    products: [],
    filterDex: [],
  }),

  watch: {
    search(val) {
      this.filterDex = this.products.filter((prd) => {
        return prd.name.indexOf(val) != -1;
      });
    },
  },

  created() {
        
    this.initialize();
  },

  methods: {
    async initialize() {
      Axios.get('/api/products').then((res) => {
                this.info = res.data
                console.log(this.info)
                this.products = res.data;
                console.log(this.products)
                this.filterDex = this.products;
                console.log(this.filterDex)
            }) 


    },

    addcart(prd) {
      const myCart = localStorage.getItem('myCart');
      console.log(JSON.parse(myCart))
      if (myCart) {
        let arr = JSON.parse(myCart)
        arr.push(prd.id)
        console.log('add cart', arr)
        localStorage.setItem('myCart', `[${arr}]`);
      } else {
        localStorage.setItem('myCart', `[${prd.id}]`);
      }
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
h3 {
  text-shadow: 3px 3px 3px rgba(0, 0, 0, 0.15);
}
.product-ttp h4 {
  font-size: 18px;
  line-height: 1.5;
  font-weight: 300;
  color: #3c186f;
  margin-top: 15px;
}
.product-fp h4 {
  font-size: 13px;
  font-weight: 700;
  color: #3c186f;
  opacity: 0.6;
}
.cute {
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  background: linear-gradient(90.72deg, rgba(146, 147, 255, 0.85) 16.46%, rgba(255, 144, 201, 0.85) 100%);
}
</style>