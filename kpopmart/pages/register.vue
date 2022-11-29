<template>
  <v-app id="register">
    <div class="bg-form">
      <v-card class="form-reg justify-center">
        <!-- logo -->
        <v-card-title class="d-flex align-center justify-center py-7">
          <router-link to="/" class="d-flex align-center">
            <v-img
              src="/logo.svg"
              max-height="150px"
              max-width="150px"
              alt="logo"
              contain
              class="me-3"
            ></v-img>
          </router-link>
        </v-card-title>
        <!-- title -->
        <v-card-text class="align-center justify-center">
          <h2 class="text-2xl font-weight-semibold text--primary mb-2">
            Register
          </h2>
          <p class="mb-2">Please register to start the adventure</p>
        </v-card-text>
        <!-- register form -->
        <v-card-text>
          <v-form>
            <v-row class="justify center mb-1 pl-3 pr-3">
              <!-- firstname -->
              <v-text-field
                v-model="FirstName"
                outlined
                label="First Name"
                placeholder="John"
                hide-details
                class="mb-3 mr-2"
                :rules="[rules.required]"
              ></v-text-field>
              <!-- lastname -->
              <v-text-field
                v-model="LastName"
                outlined
                label="Last Name"
                placeholder="Doe"
                hide-details
                class="mb-3"
                :rules="[rules.required]"
              ></v-text-field>
            </v-row>
            <!-- username -->
            <v-text-field
              v-model="username"
              outlined
              label="Username"
              placeholder="JohnDoe"
              hide-details
              class="mb-3"
              :rules="[rules.required]"
            ></v-text-field>
            <v-text-field
              v-model="email"
              outlined
              label="Email"
              placeholder="john@example.com"
              hide-details
              class="mb-3"
              :rules="[rules.required]"
            ></v-text-field>
            <v-text-field
              v-model="password"
              outlined
              :type="isPasswordVisible ? 'text' : 'password'"
              label="Password"
              placeholder="············"
              :append-icon="isPasswordVisible ? 'mdi-eye' : 'mdi-eye-off'"
              :rules="[rules.required]"
              hide-details
              @click:append="isPasswordVisible = !isPasswordVisible"
            ></v-text-field>
            <!-- agree to .. -->
            <v-checkbox
              v-model="checkbox"
              hide-details
              class="mt-1"
              :error-messages="checkboxErrors"
              :rules="[rules.required]"
            >
              <template #label>
                <div class="d-flex align-center flex-wrap">
                  <span class="me-2">I agree to</span
                  ><a href="javascript:void(0)">privacy policy &amp; terms</a>
                </div>
              </template>
            </v-checkbox>
            <v-btn block color="#9293FF" dark class="cute mt-6" @click.stop="dialog = true"> Sign Up </v-btn>
          </v-form>
        </v-card-text>
        <!-- create new account  -->
        <v-card-text class="d-flex align-center justify-center flex-wrap">
          <span class="me-2"> Already have account? </span>
          <router-link to="/login"> Login Now </router-link>
        </v-card-text>
      </v-card>
    </div>
          <v-dialog
      v-model="dialog"
    >
      <v-card class="pop-up">
        <v-card-title class="justify-center">
          <router-link to="/" class="d-flex align-center">
            <v-img
              src="/logo.svg"
              max-height="150px"
              max-width="150px"
              alt="logo"
              contain
              class="me-3"
            ></v-img>
          </router-link>
        </v-card-title>

        <v-card-title class="title justify-center mb-4">
          <h1>Registered Successful</h1>
        </v-card-title>
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn
            class="cute mb-4"
            dark
            block
            rounded
            color="#9293FF"
            to="/login"
            @click="dialog = false"
          >
            Login now
          </v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>
  </v-app>
</template>

<style>
register {
  font-family: Roboto;
}
.bg-form {
  height: 100%;
  width: 100vw;
  position: relative;
  background-size: cover;
  background-position: 50% 50%;
  background-image: url("/bgkp2.png");
}
.form-reg {
  align-items: center;
  width: 460px;
  position: relative;
  background-color: white;
  opacity: 0.8;
  margin-top: 45px;
  margin-left: 465px;
}
.pop-up {
  width: 450px;
  opacity: 0.9;
}
.title h1 {
  font-size: 32px;
  color: #6C6C6C;
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
}
.cute {
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  background: linear-gradient(90.72deg, rgba(146, 147, 255, 0.85) 16.46%, rgba(255, 144, 201, 0.85) 100%);
}
</style>

<script>
export default {
  data() {
    return {
      username: "",
      firstname: "",
      lastname: "",
      email: "",
      password: "",
      dialog: false,
      isPasswordVisible: false,
      rules: {
        required: (value) => !!value || "Required.",
      },
    };
  },
};
</script>
